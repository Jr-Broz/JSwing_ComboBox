JFrame frame = new JFrame("Exemplo JComboBox");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,150);

JPanel panel = new JPanel();
frame.add(panel);

JLabel label = new JLabel("Selecione um mês");
panel.add(label);

String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

JComboBox<String> comboBox = new JComboBox<>(meses);
panel.add(comboBox);

JButton button = new JButton("Exibir Mês Selecionado");
panel.add(button);

JTextField textField = new JTextField(15);
panel.add(textField);

button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String mesSelecionado = (String) comboBox.getSelectedItem();

        textField.setText("Mês Selecionado " + mesSelecionado);
    }
});

frame.setVisible(true);
