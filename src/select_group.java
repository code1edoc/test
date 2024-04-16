import javax.swing.*;
import java.awt.*;

public class select_group extends JFrame {

    private JTextField searchField;
    private JList<String> groupList;
    private DefaultListModel<String> listModel;
    private JPanel panel1;
    private JList list1;
    private JTextField searchGroupTextField;
    private JButton searchButton;

    public select_group() {
        setTitle("groups");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel(); // 上方面板
        northPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0)); //新布局
        searchField = new JTextField(35);
        northPanel.add(searchField); // 搜索框
        searchButton = new JButton("search");
        northPanel.add(searchButton);
        add(northPanel, BorderLayout.NORTH);

        listModel = new DefaultListModel<>();
        String[] sampleGroups = {"group1", "group1","group1","group1", "group1","group1","group1", "group1","group1","group1", "group1","group1","group1", "group1","group1","group1","group1","group1","group1","group1","group1","group1","group1","group1","group1",};
        for (String group : sampleGroups) {
            listModel.addElement(group);
        }
        groupList = new JList<>(listModel); // 放元素
        // 调字体
        groupList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                // 设置字体大小
                setFont(new Font("Arial", Font.PLAIN, 20)); // 20号字体大小

                return this;
            }
        });
        JScrollPane scrollPane = new JScrollPane(groupList);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new select_group());
    }
}
