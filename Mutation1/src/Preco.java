
public class Preco {
	
	public int obterPreco(int quantidade,boolean voucher){
		if(quantidade>=25&&voucher){
			return quantidade*5;
		}
		if(quantidade>=25||voucher){
			return quantidade*10;
		}	
		return quantidade*15;
	}

}
