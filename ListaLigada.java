public class ListaLigada {
    Celula primeira;
    Celula ultima;
    int totalElementos = 0;



    void adicionarComeco(Object elemento){
        Celula nova = new Celula(this.primeira,elemento);
        this.primeira = nova;
        if (this.totalElementos==0){
            this.ultima = this.primeira;
        }
        this.totalElementos++;
    }

    Celula pegaCelula(int posicao){
        if (!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao ao existe!");
        }else{
            Celula atual = this.primeira;
            for (int i = 0; i < posicao ; i++){
                atual = atual.getProxima();
            }
            return atual;
        }
    }

    void adiciona(Object elemento){
        if (this.totalElementos == 0){
            adicionarComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalElementos++;
        }


    }

    void adiciona(int posicao, Object elemento){
        if (posicao == 0){
            this.adicionarComeco(elemento);
        }else if(posicao == this.totalElementos){
            this.adiciona(elemento);
        }else{
            Celula anterior = this.pegaCelula(posicao-1);
            Celula nova = new Celula(anterior.getProxima(),elemento);
            anterior.setProxima(nova);
            this.totalElementos++;
        }
    }

    Object pega(int posicao){
        return this.pegaCelula(posicao).getElemento();
    }

    void removeComeco(){
        if (!this.posicaoOcupada(0)){
            throw new IllegalArgumentException("Posicao nao existe!");
        }else{
            this.primeira = this.primeira.getProxima();
            this.totalElementos--;
            if (this.totalElementos==0){
                this.ultima = null;
            }
        }
    }

    void removePosicao(int posicao){
        if (!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao nao existe!");
        }else{
            Celula anterior = this.pegaCelula(posicao-1);
            anterior.setProxima(this.pegaCelula(posicao).getProxima());
            this.totalElementos--;
        }
    }

    Boolean contem(Object elemento){
        Celula atual = this.primeira;
        while (atual!=null){
            if (atual.getElemento().equals(elemento)){
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }

    int tamanho(){
        return this.totalElementos;
    }

    boolean posicaoOcupada(int posicao){
        return ((posicao>=0)&&(posicao<this.totalElementos));
    }

    void imprimirLista(){
        System.out.println("Imprimindo...");
        Celula atual = this.primeira;
        for (int i = 0; i < this.totalElementos ; i++){
            System.out.println( (i) +"°)Nome: "+ ((Paciente) atual.getElemento()).getNome()+
                    ". Idade: "+ ((Paciente) atual.getElemento()).getIdade()+
                    ". Sexo: "+ ((Paciente) atual.getElemento()).getSexo());

            atual = atual.getProxima();
        }
    }


    public Celula getPrimeira() {
        return primeira;
    }

    public void setPrimeira(Celula primeira) {
        this.primeira = primeira;
    }

    public Celula getUltima() {
        return ultima;
    }

    public void setUltima(Celula ultima) {
        this.ultima = ultima;
    }

    public int getTotalElementos() {
        return totalElementos;
    }

    public void setTotalElementos(int totalElementos) {
        this.totalElementos = totalElementos;
    }

}
