import { test, expect, Page } from '@playwright/test';

export async function clickOnLeadsLink(page:Page) {
    await page.locator("//a[@href='index.php?module=Leads&action=index']").click();  
}

export async function clickOnOrgnizationsLink(page:Page) {
    await page.locator("//td[@class='tabUnSelected']//a[@href='index.php?module=Accounts&action=index']").click();  
}