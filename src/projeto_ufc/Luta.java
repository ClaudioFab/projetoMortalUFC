
package projeto_ufc;
 
import java.util.Random;
import javax.swing.JOptionPane;
 
public class Luta {
 
    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovado = false;
 
    
    //Marcando lutas e impedindo categorias diferentes de entrar.
    //Impedindo também lutadores iguais.
    //Deixando mensagem para o loop de luta desaprovada.
    public void marcarLuta(Lutador a, Lutador b) {
        if (a.getCategoria().equals(b.getCategoria()) && a != b) {
            this.aprovado = true;
            System.out.println("Luta entre "+a.getNome()+" e "+b.getNome()+" Aprovada!\n");
            JOptionPane.showMessageDialog(null,"Luta entre "+a.getNome()+" e "+b.getNome()+" Aprovada!","Ready!",JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.aprovado = false;
            System.out.println("Luta entre "+a.getNome()+" e "+b.getNome()+"\nFoi desaprovada por problemas de categoria!\n");
            System.out.println("O Imperador Shao Kahn exige um novo combate!\n");
            JOptionPane.showMessageDialog(null,"Luta entre "+a.getNome()+" e "+b.getNome()+"\nFoi desaprovada por problemas de categoria!","Ermac ERROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"O Imperador Shao Kahn exige um novo combate!","Prepare to die!",JOptionPane.WARNING_MESSAGE);
        }
 
    }
 
    //Inicio das lutas puxando aprovação para selecionar...
    //vitorias, derrotas e empates por round. 
    public void Lutar(Lutador a, Lutador b) {
 
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
 
        if (aprovado) {
            switch (vencedor) {
                case 0:
                    System.out.println("Empate! "+a.getNome()+" e "+b.getNome()+" Empataram!\n");
                    JOptionPane.showMessageDialog(null,"Empate! "+a.getNome()+" e "+b.getNome()+" Empataram!","FIGHT!",JOptionPane.INFORMATION_MESSAGE);
                    a.empatarLuta();
                    b.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória de "+a.getNome()+" !!\n"+b.getNome()+" foi derrotado.\n");
                    JOptionPane.showMessageDialog(null,"Vitória de "+a.getNome()+" !!\n"+b.getNome()+" foi derrotado.","FIGHT!",JOptionPane.INFORMATION_MESSAGE);
                    a.ganharLuta();
                    b.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória de "+b.getNome()+" !!\n"+a.getNome()+" foi derrotado.\n");
                    JOptionPane.showMessageDialog(null,"Vitória de "+b.getNome()+" !!\n"+a.getNome()+" foi derrotado.","FIGHT!",JOptionPane.INFORMATION_MESSAGE);
                    b.ganharLuta();
                    a.perderLuta();
                    break;
                default:
                    throw new AssertionError();
            }
 
        }
 
    }
    //Separação por Rounds.
    public int round(int valor){
        if(aprovado){
            System.out.println("Round "+valor+"... Fight! ");
            JOptionPane.showMessageDialog(null,"<html><div style='text-align:center;'><span style='font-size:20px; font-weight:bold;'>ROUND "+valor+"</span><br><br><span style='font-size:30px; color:red; font-weight:bold;'>FIGHT!</span></div></html>","Round " + valor,JOptionPane.INFORMATION_MESSAGE);
        }
        return valor; 
    }
    //Placar final do vencedor de todos os Rounds
    //Quem teve mais lutas contadas em this.vitorias++ da classe luta.
    //Escolher Fatality ou não.
    public void placarFinal(Lutador a, Lutador b){
        if(a.getVitorias() > b.getVitorias()){
            System.out.println("O vencedor do combate é "+a.getNome()+"!!");
            JOptionPane.showMessageDialog(null,"<html>O vencedor do combate é <br><br><span style='font-size:20px; font-weight:bold;'>"+a.getNome()+"!!","WINNER!",JOptionPane.WARNING_MESSAGE);
        
            int fatal = JOptionPane.showConfirmDialog(null,"<html><div style='text-align:center;'><span style='font-size:18px;color:red;font-weight:bold;'>FINISH HIM!!</span><br><br>"+a.getNome()+" aplicará Fatality?\n\n","Fatality!!",JOptionPane.YES_NO_OPTION);
        
            if(fatal == JOptionPane.NO_OPTION){
                System.out.println(a.getNome()+" escolhe piedade...\n\n¯¯\\__(o_õ)__/¯¯");
                JOptionPane.showMessageDialog(null,a.getNome()+" escolhe piedade...\n\n¯¯\\__(o_õ)__/¯¯","Mercy!",JOptionPane.INFORMATION_MESSAGE);
                
            }else if(fatal == JOptionPane.YES_OPTION){
                System.out.println(a.getNome()+" aplicará Fatality em "+b.getNome()+"...!\n\nO conteúdo foi restrito pela Lei do ECA Digital!");
                JOptionPane.showMessageDialog(null,a.getNome()+" aplicará Fatality em "+b.getNome()+"...","FATALITY!!",JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(null,"O conteúdo foi restrito pela Lei do ECA Digital.","Negado!",JOptionPane.ERROR_MESSAGE);
                
            }
        
        }else if(b.getVitorias() > a.getVitorias()){
            System.out.println("O vencedor do combate é "+b.getNome()+"!!");
            JOptionPane.showMessageDialog(null,"<html>O vencedor do combate é <br><br><span style='font-size:20px; font-weight:bold;'>"+b.getNome()+"!!","WINNER!",JOptionPane.WARNING_MESSAGE);
        
            int fatal = JOptionPane.showConfirmDialog(null,"<html><div style='text-align:center;'><span style='font-size:18px;color:red;font-weight:bold;'>FINISH HIM!!</span><br><br>"+b.getNome()+" aplicará Fatality?\n\n","Fatality!!",JOptionPane.YES_NO_OPTION);
        
            if(fatal == JOptionPane.NO_OPTION){
                System.out.println(b.getNome()+" escolhe piedade...\n\n¯¯\\__(o_õ)__/¯¯");
                JOptionPane.showMessageDialog(null,b.getNome()+" escolhe piedade...\n\n¯¯\\__(o_õ)__/¯¯","Mercy!",JOptionPane.INFORMATION_MESSAGE);
                
            }else if(fatal == JOptionPane.YES_OPTION){
                System.out.println(b.getNome()+" aplicará Fatality em "+a.getNome()+"...!\n\nO conteúdo foi restrito pela Lei do ECA Digital!");
                JOptionPane.showMessageDialog(null,b.getNome()+" aplicará Fatality em "+a.getNome()+"...","FATALITY!!",JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(null,"O conteúdo foi restrito pela Lei do ECA Digital.","Negado!",JOptionPane.ERROR_MESSAGE);
 
            }
            
        }else{
            System.out.println("O combate terminou em empate total entre "+a.getNome()+" e "+b.getNome()+"!!\n");
            JOptionPane.showMessageDialog(null,"<html>O combate terminou em empate total entre <br><br><span style='font-size:20px; font-weight:bold;'>"+a.getNome()+" e "+b.getNome()+"!!","DRAW!",JOptionPane.WARNING_MESSAGE);
            
        }
            
        
        
    }

    //Segunda seleção para aprovação na Main.
    public boolean novoAprovado(){
        return aprovado;
        
    }
    

 
 
}
