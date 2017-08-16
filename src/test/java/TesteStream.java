import org.junit.Assert;
import org.junit.Test;

import br.com.desafio.stream.AppStreamExecute;
import br.com.desafio.stream.StreamInterfaceImpl;

public class TesteStream {

    private char testStremGeneric(String stream) throws Exception {

		 return AppStreamExecute.firstChar(new StreamInterfaceImpl(stream));
	}
	
	@Test
	public void test() {
		
		try {
			
			char caracters = testStremGeneric("aAbBABafe");

			Assert.assertEquals('E', caracters);
			
		} catch (Exception e) {
			Assert.fail( "ERROR" + e.getMessage());
		}
	}
	
	@Test
	public void testInicio() {
		
		try {
			
			char caracters = testStremGeneric("afoiUAHGEiuhaieuHAIEuhaiuehaiuehaiuheiuahdiuahwiuwhdiuawh");

			Assert.assertEquals('O', caracters);
			
		} catch (Exception e) {
			Assert.fail( "ERROR" + e.getLocalizedMessage());
		}
	}
	
	
	@Test
	public void testMeio() {
		
		try {
			
			char caracters = testStremGeneric("aaaaaaaaaaaaaaaaaaaaaaaaaijoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGGGGGGGGGdefffffff");

			Assert.assertEquals('O', caracters);
			
		} catch (Exception e) {
			Assert.fail( "ERROR" + e.getMessage());
		}
	}
	
	
	@Test
	public void testSemRetorno() {
		
		try {
			
			char caracters = testStremGeneric("AHUIHAEIUHEAIUEHIUSahDIUHAUSIDHIAUWhiuWHDAiuwhduihduiahwdawiudhaui");

			Assert.assertEquals( "Z", String.valueOf(caracters));
			
		} catch (Exception e) {
			Assert.fail( "ERROR" + e.getMessage());
		}
	}

}
