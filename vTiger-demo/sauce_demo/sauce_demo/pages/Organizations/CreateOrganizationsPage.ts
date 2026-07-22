import { Page } from "playwright";
export async function enterOrganizationsName(page:Page) {
    
await page.locator("//input[@name='accountname']").fill("Ramesh");

}
export async function enterOrganizationsWebsite(page:Page) {
    
await page.locator("//input[@name='website']").fill("www.youTube.com");

}
export async function enterOrganizationsTickersymbol(page:Page) {
    
await page.locator("//input[@name='tickersymbol']").fill("@@@@");

}
export async function enterOrganizationsEmployees(page:Page) {
    
await page.locator("//input[@name='employees']").fill("Rohan");

}
export async function enterOrganizationsEmail2(page:Page) {
    
await page.locator("//input[@name='email2']").fill("rohan2345@gmail.com");

}
export async function selectOrganizationsIndustry(page:Page) {
    
await page.locator("//select[@name='industry']").selectOption("Banking");

}
export async function selectOrganizationsType(page:Page) {
    
await page.locator("//select[@name='accounttype']").selectOption("Customer");

}
export async function clickOrganizationsEmailoptout(page:Page) {
    
await page.locator("//input[@name='emailoptout']").click();

}
export async function fillMandatoryFieldsOrganizationsForm(page:Page) {
await page.locator("//input[@name='accountname']").fill("Ramesh");

}
export async function clickOnSaveButton(page:Page) {
    await page.locator("//b[text()='Description Information']/ancestor::tr/following-sibling::tr//input[@class='crmbutton small save']").click();
    
}
export async function clickOnCancelButton(page:Page) {
    await page.locator("//b[text()='Description Information']/ancestor::tr/following-sibling::tr//input[@class='crmbutton small cancel']").click();
    
}



