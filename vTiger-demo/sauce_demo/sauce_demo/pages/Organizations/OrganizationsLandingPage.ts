import { Page } from "playwright";

export async function clickOnOrganizationsCreateButton(page:Page) {
    
await page.locator("//img[@src='themes/softed/images/btnL3Add.gif']").click();

}
export async function enterSearchBoxOrganizationsName(page:Page) {
    
await page.locator("//input[@class='txtBox']").fill("");

}
export async function selectOrganizationsDropdown(page:Page) {
    
await page.locator("//div[@id='basicsearchcolumns_real']//select[@id='bas_searchfield']").selectOption("Organization Name");

}
export async function clickOnOrganizationsSearchNow(page:Page) {
    
await page.locator("//input[@name='submit']").click();

}
export async function selectOnOrganizationsFilters(page:Page) {
    
await page.locator("//select[@id='viewname']").selectOption("All");

}
export async function clickOnOrganizationsDeleteButton(page:Page) {
    
await page.locator("(//input[@class='crmbutton small delete'])[1]").click();

}
export async function selectExistingOrganizations(page:Page) {
    
await page.locator("//img[@src='themes/softed/images/btnL3Add.gif']").click();

}












