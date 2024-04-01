package batchExecution;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchPurple {
	@Test
	public void purple() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.purplle.com/?campaign=GS_Google_Sok_Search_Brand_Misspell&channel=google_search&feature=paid&~campaign=GS_Google_Sok_Search_Brand_Misspell&~channel=google_search&~feature=paid&~placement=&~secondary_publisher=&~tags=&~click_id=&$aaid=&$idfa=&$3p=&$og_image_url=https:%2F%2Fmedia6.ppl-media.com%2Ftr:w-500,h-400,c-at-max,fo-left%2Fmediafiles%2Fecomm%2Flandingpage%2F1445327606_invite-banner.jpg&$deeplink_path=purplle.com:%2F%2Foffers&utm_source=google_search&utm_medium=paid&utm_campaign=GS_Google_Sok_Search_Brand_Misspell&visitorppl=MLTDAh3xC7hNgFuE7H&gclid=CjwKCAiArfauBhApEiwAeoB7qAbUqQqfxco890Ph5NNCvvB3J_gb3YKbZV7AbV3-3jasSNqfyLybQxoCtRYQAvD_BwE&_branch_match_id=1291245388131406483&_branch_referrer=H4sIAAAAAAAAA5VR247aMBD9GnhLoATItlJUhcCClotK0yLtvlhOMr4QJza2k8Df12G7UlvtQ1ey5BnPOWfOjJm1ynwZjbI694Ud4VEJNyR4C%2BhMxP70sN9m7YYv9%2BsgjTdP24oJk5wT2L2UX3NcKcxpHa1TtJaSCkCpLFEKWOcMLTSuC7TnxigQYpgzXNcgIvoKNHfQkAC2jYbI6RTDQbj6kGSPf1fVFf4WnkwlRbzCFFCjRcT6mQdBPJg8ulNBwfHcV0p499DPZeWerXaIzpuNx4NJwrzp%2Fc49bL0KX11IpCeA2DcBwgUYl4Bj93ThrPKaKtfTZZ%2Bm01kwCefjOeJ1yy14WW9c%2B2dFe3sFmNJK9Y67rut81WglBPw21uMJFiLDefnfhAJACV6XSGHLoj%2FrbzxJCGgzbGyFjGx0Dv8stS%2F0kzbV61L7%2FEPf1XLDrdRuz9F%2B92MZs%2BCahOxAH5tVuBnSXPAiSs7dNol5rAluFixWK97FIBfhJc5%2BXo4Xcs3lw%2BfxNzY7HJK2XQRPiGbB8zZ7OYVxdgq84IxNeriQ2%2B6WHa8ysd%2Bfj3G7RItu9QsaXnnQ6QIAAA%3D%3D");
		driver.quit();

}
}