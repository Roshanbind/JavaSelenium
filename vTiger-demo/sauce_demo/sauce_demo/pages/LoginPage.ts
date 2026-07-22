import { Page } from "@playwright/test";


export async function login(page:Page) {
    await page.goto("http://localhost:8181/");
    await page.locator("input['user_name']").fill("admin");            
    await page.locator("input[name='user_password']").fill("admin1");    
    await page.locator("input[type='submit']").click();



}



