import javax.swing.*;
import java.awt.Dimension;

public class Janela extends JFrame {

    private JPanel p;
    private LtTarefa LtTarefa;

    public Janela(){
        setTitle("Tarefas Pendentes");
        setSize(500,500);
        setLocation(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        LtTarefa = new LtTarefa();
        configurarJanela();
        setVisible(true);
    }
    private void configurarJanela() {
        p = new JPanel();
        GroupLayout JanelaLayout = new GroupLayout(p);
        JanelaLayout.setAutoCreateGaps(true);
        JanelaLayout.setAutoCreateContainerGaps(true);
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(p);

        JLabel CaixaEntrada = new JLabel("Caixa De Entrada");
        Dimension size = CaixaEntrada.getPreferredSize();
        CaixaEntrada.setLayout(null);
        CaixaEntrada.setBounds(150, 100, size.width, size.height);
        p.add(CaixaEntrada);

        JButton BtTarefa = new JButton("Nova Tarefa");
        p.add(Box.createVerticalStrut(20));
        p.add(Box.createHorizontalStrut(190));
        p.add(BtTarefa);

        StringLista();
        add(scrollPane);       
    }

    private void StringLista(){
        for(String s : LtTarefa.NumLista()){
            p.add(criarItemDaLista(s));
            p.add(Box.createVerticalStrut(10));
            p.add(Box.createHorizontalStrut(30));
        }
    }

    private JPanel criarItemDaLista(String item){
        JPanel panel = new JPanel();
        JLabel label = new JLabel(item);

        JCheckBox CheckBox = new JCheckBox("");
        CheckBox.setSelected(true);
        panel.add(CheckBox);

        panel.setBorder(BorderFactory.createEtchedBorder());
        panel.add(label);
        return panel;
    }

}
