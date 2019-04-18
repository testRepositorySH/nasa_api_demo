package MainApi;

import org.testng.annotations.Test;

public class TestClass {
	
	CommonApi commonApi = new CommonApi();
	@Test
	public void qTest() {
		commonApi.testQ();
	}
	@Test
	public void medio_type() {
		commonApi.media_type();
	}
	@Test
	public void year_start() {
		commonApi.year_start();
	}
	@Test
	public void year_end() {
		commonApi.yearEnd();
	}
}
