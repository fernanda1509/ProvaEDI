public class ListaSimplesEncadeada<T extends Comparable<T>> extends Lista<T> {


    public ListaSimplesEncadeada(){

    }

    @Override
    public void incluir(T elemento);{
        Lista(qtd) = T;
        qtd++;

    }


    public T get(int posicao){
        if (posicao < qtd){
            return Lista(posicao);
        }
        if (posicao >= qtd){
            throw new Exception("Não existe essa posição");
        }

    }


    public int getPosElemento(T elemento) {
        for(i =0 , i = qtd- 1; i++){
            if(Lista(i)==elemento){
                return i;
                break;
            }
        }
        throw new Exception("Não contem esse elemento");

    }

    @Override
    public void remover(int posicao) {
        if (posicao == qtd-1){
            qtd--;
        }
        if (posicao < qtd){
            for(i= pos, i = qtd - 1; i++){
                Lista(i) = Lista(i + 1);
            }
            qtd--;
        }
        throw new Exception("Não existe essa posição");

    }

    @Override
    public int getTamanho() {
        return qtd;
    }

    public void limpar() {
        qtd = 0;
    }



    @Override
    public boolean contem(T elemento) {
        for(i =0 , i = qtd- 1; i++){
            if(Lista(i)==elemento){
                return true;
                break;
            }
        }
        return false;
        throw new Exception("Não contem esse elemento");

    }
}
