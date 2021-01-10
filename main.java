public class main {
    public static void main(String[] args){
        ListaLigada listaPacientes = new ListaLigada();

        Paciente p1 = new Paciente("Gustavo", (byte) 20, 'm');
        Paciente p2 = new Paciente("Lucas", (byte) 19, 'm');
        Paciente p3 = new Paciente("Maria", (byte) 22, 'f');
        Paciente p4 = new Paciente("Julia", (byte) 27, 'f');
        Paciente p5 = new Paciente("Marcos", (byte) 19, 'm');
        Paciente p6 = new Paciente("Thiago", (byte) 18, 'm');
        Paciente p7 = new Paciente("Gabriele", (byte) 21, 'f');

        listaPacientes.adiciona(p1);
        listaPacientes.adiciona(p3);
        listaPacientes.adiciona(p5);
        listaPacientes.adiciona(p2);
        listaPacientes.adiciona(p4);

        listaPacientes.imprimirLista();
        listaPacientes.removeComeco();
        listaPacientes.imprimirLista();
        listaPacientes.removePosicao(1);
        listaPacientes.imprimirLista();

        listaPacientes.adiciona(3,p6);
        listaPacientes.adiciona(2,p7);

        listaPacientes.imprimirLista();



    }

}
