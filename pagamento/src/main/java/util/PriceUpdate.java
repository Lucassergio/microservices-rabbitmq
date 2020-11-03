package util;

import java.util.function.Consumer;

import com.example.pagamento.data.vo.ProdutoVendaVO;

public class PriceUpdate implements Consumer<ProdutoVendaVO> {

	@Override
	public void accept(ProdutoVendaVO t) {
		t.setQuantidade(t.getQuantidade() * 2);
	}

}
