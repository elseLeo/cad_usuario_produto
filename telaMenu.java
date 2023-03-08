import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaMenu extends JFrame {
    private JPanel pnlTelaMenu;
    private JButton btnUsuario;
    private JButton btnProduto;

    public telaMenu() {
        iniciarComponentes();
        criarListners();

    }
    public void iniciarComponentes(){

        setTitle("Tela de Menu");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaMenu);
        setVisible(true);
    }
    public void criarListners(){
        btnProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastroProduto cadastroProduto = new cadastroProduto();
                cadastroProduto.setVisible(true);
                dispose();
            }
        });
        btnUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastroUsuario cadastroUsuario = new cadastroUsuario();
                cadastroUsuario.setVisible(true);
                dispose();

            }
        });
    }
}
