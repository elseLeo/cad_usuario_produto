import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastroUsuario extends JFrame{
    private JPanel telaUsuario;
    private JTextField txtNomeUsuario;
    private JTextField txtSobrenome;
    private JTextField txtSetor;
    private JTextField txtFuncao;
    private JLabel lblNomeUsuario;
    private JLabel lblSobrenome;
    private JLabel lblSetor;
    private JLabel lblFuncao;
    private JButton btnOK;
    private JTextField txtLoginUsuario;
    private JTextField txtSenhaUsuario;
    private JButton btnBack;

    public cadastroUsuario() {
        iniciarComponentes();
        criarListners();

    }
    public void iniciarComponentes(){

        setTitle("Cadastro de Usuário");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telaUsuario);
        setVisible(true);
    }
    public void criarListners(){
    btnOK.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nomeUsuario = txtNomeUsuario.getText();
            String sobrenome = txtSobrenome.getText();
            String setor = txtSetor.getText();
            String funcao = txtFuncao.getText();
            String loginUsuario = txtLoginUsuario.getText();
            String senhaUsuario = txtSenhaUsuario.getText();

            JOptionPane.showMessageDialog(btnOK, "O seguinte usuário foi cadastrado com sucesso: \n"
                    + "Nome: " + nomeUsuario + "\n"
                    + "Sobrenome:: " + sobrenome + "\n"
                    + "Setor:: " + setor + "\n"
                    + "Função: " + funcao);

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
