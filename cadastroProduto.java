import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastroProduto  extends JFrame{
    private JPanel cadastroProduto;
    private JTextField txtCodigo;
    private JLabel lblCodigo;
    private JLabel lblDescricao;
    private JLabel lblPreco;
    private JLabel lblEstoque;
    private JTextField txtDescricao;
    private JTextField txtPreco;
    private JTextField txtEstoque;
    private JButton bntOK;
    private JButton btnBack;

    public cadastroProduto() {
    criarListners();
    iniciarComponentes();
    }
    public void iniciarComponentes(){

        setTitle("Cadastro de Produto");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(cadastroProduto);
        setVisible(true);
    }
    public void criarListners(){
    bntOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(bntOK,"");
            String codProduto = txtCodigo.getText();
            String descProduto = txtDescricao.getText();
            String precoProduto = txtPreco.getText();
            String qtdEstoqueProduto = txtEstoque.getText();

            JOptionPane.showMessageDialog(bntOK, "O seguinte produto foi cadastrado com sucesso: \n"
                    + "Código: " + codProduto + "\n"
                    + "Descrição: " + descProduto + "\n"
                    + "Preço: " + precoProduto + "\n"
                    + "Quantidade adicionada ao estoque: " + qtdEstoqueProduto);
        }
    });
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaMenu telaMenu = new telaMenu();
                telaMenu.setVisible(true);
                dispose();
            }
        });
}

}
