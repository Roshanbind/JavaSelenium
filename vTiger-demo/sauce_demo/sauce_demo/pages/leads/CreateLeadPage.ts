import { test, expect, Page } from '@playwright/test';

export async function fillMandatoryFieldsLeadForm(page:Page) {
    await page.locator("input[name='lastname']").fill("Bind");
    await page.locator("input[name='company']").fill("TestLeaf");
}

export async function fillAllFieldsLeadForm(page:Page) {
    
    await page.locator("input[name='lastname']").fill("Bind");
    await page.locator("input[name='company']").fill("EVA");
    await page.locator("input[name='firstname']").fill("Rahul");
    await page.locator("input[name='email']").fill(" ");        
    await page.locator("input[name='phone']").fill("1234567890");
}


export async function saveLead(page:Page) {
    await page.locator("//input[@title='Save [Alt+S]']").first().click();
}