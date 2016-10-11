import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

public class TestarPreco {

	@Test
	public void test_1unidade() {
		Preco preco=new Preco();
		int quantidade=1;
		Assert.assertEquals(15,preco.obterPreco(quantidade, false));
	}
		
	@Test
	public void test_100unidade() {
		Preco preco=new Preco();
		int quantidade=100;
		Assert.assertEquals(1000,preco.obterPreco(quantidade, false));
	}

	@Test
	public void test_1unidadeComVoucher() {
		Preco preco=new Preco();
		int quantidade=1;
		Assert.assertEquals(10,preco.obterPreco(quantidade, true));
	}
	
	
	@Test
	public void test_100unidadecomVoucher() {
		Preco preco=new Preco();
		int quantidade=100;
		Assert.assertEquals(500,preco.obterPreco(quantidade, true));
	}
		
	@Ignore
	@Test
	public void test_25unidade() {
		Preco preco=new Preco();
		int quantidade=25;
		Assert.assertEquals(250,preco.obterPreco(quantidade, false));
	}
	
	@Ignore
	@Test
	public void test_25unidadeComVoucher() {
		Preco preco=new Preco();
		int quantidade=25;
		Assert.assertEquals(125,preco.obterPreco(quantidade, true));
	}
	
}
