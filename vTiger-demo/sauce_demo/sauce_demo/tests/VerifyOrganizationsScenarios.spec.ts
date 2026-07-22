import { test, expect, Page } from '@playwright/test';
import * as loginPage from '../pages/LoginPage';
import * as homePage from '../pages/HomePage'
import * as organizationsLandingPage from '../pages/Organizations/OrganizationsLandingPage'
import * as createOrganizationsPage from '../pages/Organizations/CreateOrganizationsPage'


test("TC_ORG_001 – Verify Organization Creation", async ({ page }) => {
  await loginPage.login(page);
  await homePage.clickOnOrgnizationsLink(page);
  await organizationsLandingPage.clickOnOrganizationsCreateButton(page);
  await createOrganizationsPage.fillMandatoryFieldsOrganizationsForm(page);
  await createOrganizationsPage.clickOnSaveButton(page);

})

