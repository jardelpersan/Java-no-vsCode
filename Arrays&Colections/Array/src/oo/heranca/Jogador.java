package oo.heranca;

public class Jogador {
    int x;
    int y;
    int vida = 100;

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);
        
        if (deltaX == 0 && deltaY == 1 || deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10; // Diminui a vida do oponente em 10
            if (oponente.vida < 0) {
                oponente.vida = 0; // Garante que a vida não fique negativa
            }
            return true; // Ataque bem-sucedido
        }
        return false; // Ataque falhou
    }

    boolean andar(Direcao direcao) {
       switch (direcao) {
            case NORTE:
                y++;
                break;
            case SUL:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
            default:
                return false; // Direção inválida
        }
        return true; // Movimento bem-sucedido
    }
        
}
