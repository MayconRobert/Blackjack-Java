
public class Regras {

    protected static int vencedor(int pontosPlayer, int pontosMaquina){
        //Ambos estouraram
        if(pontosPlayer > 21 && pontosMaquina > 21){
            return 0;
        //Player venceu
        }else if((pontosMaquina > 21) || (pontosPlayer <= 21 && pontosPlayer > pontosMaquina)){
            return 1;
        //Bot venceu
        }else if((pontosPlayer > 21) || (pontosMaquina <= 21 && pontosPlayer < pontosMaquina)){
            return 2;
        //Empate
        }else{
            return 3;
        }
        
    }

}
