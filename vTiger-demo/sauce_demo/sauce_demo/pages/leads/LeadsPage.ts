import { test, expect, Page } from '@playwright/test';


export async function clickCreateLeadButton(page:Page) {
    await page.locator("//img[@title='Create Lead...']").click();
    
}

export async function openFirstLeadDetails(page:Page) {
    await page.locator("//a[@title='Leads']").first().click();
}

export async function clickOnEditButton(page:Page) {
    await page.locator("//td[@class='dvtTabCache']//input[@name='Edit']").click();
    
}


