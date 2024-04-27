package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> agenda;

    public Agenda() {
        agenda = new ArrayList<>();
    }

    public boolean addContato(Contato c){
        if(agenda.contains(c)) {
            System.out.println("Contato já existe!\n");
            return false;
        }
        agenda.add(c);
        System.out.println("Contato Adicionado\n");
        return true;
    }

    public boolean removeContato(String n, String s){
        return agenda.removeIf(elemento->elemento.getNome().equals(n) && elemento.getSobrenome().equals(s));;
    }

    public boolean addTelefone(String r, String n, Contato c){
        if (agenda.contains(c)){agenda.forEach(contato -> {
            if (contato.equals(c)) {contato.addTelefone(r, n);
            }
        });
            System.out.println("Telefone removido!\n");
            return true;
        }
        System.out.println("Contato não encontrato!\n");
        return false;
    }

    public boolean addEmail(String r, String e, Contato c){
        if (agenda.contains(c)){agenda.forEach(contato -> {
            if (contato.equals(c)) {contato.addEmail(r, e);
            }
        });
            System.out.println("Email removido!\n");
            return true;
        }
        System.out.println("Contato nao encontrado!\n");
        return false;
    }

    public boolean updateTelefone(String r, String n, Contato c){
        if (agenda.contains(c)){agenda.forEach(contato -> {
            if (contato.equals(c)) {contato.updateTelefone(r, n);
            }
        });
            System.out.println("Telefone alterado!");
            return true;
        }
        System.out.println("Contato não encontrado!");
        return false;
    }


    public boolean updateEmail(String r, String n, Contato c){
        if (agenda.contains(c)){agenda.forEach(contato -> {
            if (contato.equals(c)) {contato.updateEmail(r, n);
            }
        });
            System.out.println("Email Alterado!\n");
            return true;
        }
        System.out.println("Contato não encontrato!\n");
        return false;
    }

    public boolean removeTelefone(String r, Contato c){
        if (agenda.contains(c)){agenda.forEach(contato -> {
            if (contato.equals(c)) {contato.removeTelefone(r);
            }
        });
            System.out.println("Telefone removido!\n");
            return true;
        }
        System.out.println("Cadastro não encontrado\n");
        return false;
    }

    public boolean removeEmail(String r, Contato c){
        if (agenda.contains(c)){agenda.forEach(contato -> {
            if (contato.equals(c)) {contato.removeEmail(r);
            }
        });
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "Agenda{" +
                "agenda=" + agenda +
                '}';
    }
}
