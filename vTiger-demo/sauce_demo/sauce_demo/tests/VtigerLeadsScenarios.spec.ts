import { test, expect, Page } from '@playwright/test';
import * as loginPage from '../pages/LoginPage';
import * as homePage from '../pages/HomePage'
import * as leadsPage from '../pages/leads/LeadsPage'
import * as createLeadPage from '../pages/leads/CreateLeadPage'


test('Verify Create Lead Mandatory Fields', async ({ page }) => {
    await loginPage.login(page);
    await homePage.clickOnLeadsLink(page);
    await leadsPage.clickCreateLeadButton(page);
    await createLeadPage.fillMandatoryFieldsLeadForm(page);
    await createLeadPage.saveLead(page);
})


test('Verify Create Lead All Fields', async ({ page }) => {
    await loginPage.login(page);
    await homePage.clickOnLeadsLink(page);
    await leadsPage.clickCreateLeadButton(page);
    await createLeadPage.fillAllFieldsLeadForm(page);
    await createLeadPage.saveLead(page);   
 
})


test('Verify Edit Lead Functionality', async ({ page }) => {
   

});