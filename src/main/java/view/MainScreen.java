/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Project;
import model.Task;
import util.ButtonColumnCellRederer;
import util.DeadlineColumnCellRederer;
import util.TaskTableModel;
import view.TaskDialogScreen;



public class MainScreen extends javax.swing.JFrame {
    
    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel projectsModel;
    TaskTableModel tasksModel;
    

   
    public MainScreen() {
        initComponents();
        
        
        initDataController();
        initComponetsModel();
        decorateTableTasks();
        
         
    }

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jPanelTooBar = new javax.swing.JPanel();
        jLabelTooBarTitle = new javax.swing.JLabel();
        jLabelTooBarSubTitle = new javax.swing.JLabel();
        jPanelProjects = new javax.swing.JPanel();
        jLabelProjectsTitle = new javax.swing.JLabel();
        jLabelProjectsAdd = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTasksTitle = new javax.swing.JLabel();
        jLabelTasksAdd = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPaneProjects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListTitle = new javax.swing.JLabel();
        jLabelEmptyListsubTitle = new javax.swing.JLabel();

        jScrollPaneTasks.setBackground(java.awt.Color.white);
        jScrollPaneTasks.setPreferredSize(new java.awt.Dimension(258, 402));

        jTableTasks.setBackground(new java.awt.Color(255, 255, 255));
        jTableTasks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTableTasks.setForeground(java.awt.Color.black);
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableTasks.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableTasks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableTasks.setFillsViewportHeight(true);
        jTableTasks.setGridColor(java.awt.Color.black);
        jTableTasks.setName(""); // NOI18N
        jTableTasks.setPreferredSize(new java.awt.Dimension(258, 600));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTableTasks.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.getTableHeader().setResizingAllowed(false);
        jTableTasks.getTableHeader().setReorderingAllowed(false);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        jPanelTooBar.setBackground(new java.awt.Color(0, 0, 0));

        jLabelTooBarTitle.setBackground(new java.awt.Color(0, 153, 51));
        jLabelTooBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelTooBarTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelTooBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tick.png"))); // NOI18N
        jLabelTooBarTitle.setText("  ToDo App");

        jLabelTooBarSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTooBarSubTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelTooBarSubTitle.setText("Anote tudo, não esqueça nada.");

        javax.swing.GroupLayout jPanelTooBarLayout = new javax.swing.GroupLayout(jPanelTooBar);
        jPanelTooBar.setLayout(jPanelTooBarLayout);
        jPanelTooBarLayout.setHorizontalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTooBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTooBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTooBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTooBarLayout.setVerticalGroup(
            jPanelTooBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTooBarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelTooBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTooBarSubTitle)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanelProjects.setBackground(java.awt.Color.white);
        jPanelProjects.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProjectsTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelProjectsTitle.setText("Projetos");
        jLabelProjectsTitle.setToolTipText("");

        jLabelProjectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
        jPanelProjects.setLayout(jPanelProjectsLayout);
        jPanelProjectsLayout.setHorizontalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProjectsAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProjectsLayout.setVerticalGroup(
            jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProjectsTitle)
                    .addComponent(jLabelProjectsAdd))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelTasks.setBackground(java.awt.Color.white);
        jPanelTasks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelTasks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTasksTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelTasksTitle.setText("Tarefas");

        jLabelTasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabelTasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTasksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTasksAdd)
                .addContainerGap())
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTasksAdd)
                    .addComponent(jLabelTasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelProjectList.setBackground(java.awt.Color.white);
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jListProjects.setBackground(java.awt.Color.white);
        jListProjects.setBorder(null);
        jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jListProjects.setForeground(new java.awt.Color(0, 0, 0));
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPaneProjects.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects)
                .addContainerGap())
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProjects)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setBackground(java.awt.Color.white);
        jPanelEmptyList.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelEmptyList.setForeground(java.awt.Color.white);

        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

        jLabelEmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmptyListTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTitle.setText("Nenhuma tarefa por aqui.");
        jLabelEmptyListTitle.setToolTipText("");

        jLabelEmptyListsubTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelEmptyListsubTitle.setForeground(new java.awt.Color(0, 153, 102));
        jLabelEmptyListsubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListsubTitle.setText("Clique no botão + para adicionar uma nova tarefa.");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEmptyListsubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabelEmptyListTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelEmptyListIcon)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmptyListTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmptyListsubTitle)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        jPanel7.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTooBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTooBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectsAddMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        projectDialogScreen.addWindowListener (new WindowAdapter() {
        
  
        public void windowClosed(WindowEvent e){
           loadProjects();
        }
    });

    }//GEN-LAST:event_jLabelProjectsAddMouseClicked

    private void jLabelTasksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTasksAddMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        taskDialogScreen.setProject(project);
        
        taskDialogScreen.setVisible(true);
        
        taskDialogScreen.addWindowListener(new WindowAdapter(){
        
            public void windowClosed(WindowEvent e){
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
            }
            
        });
        
        
    }//GEN-LAST:event_jLabelTasksAddMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // TODO add your handling code here:
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = tasksModel.getTasks().get(rowIndex);
        switch(columnIndex){
            case 3:
                
                taskController.update(task);
                break;
                
            case 4:
                JPanel editPanel = new JPanel(new GridLayout(0, 1));
    JTextField nameField = new JTextField(task.getName());
    JTextArea descriptionArea = new JTextArea(task.getDescription(), 5, 20);
    // Adicionando os campos ao painel de edição
    editPanel.add(new JLabel("Novo Nome:"));
    editPanel.add(nameField);
    editPanel.add(new JLabel("Nova Descrição:"));
    editPanel.add(new JScrollPane(descriptionArea));
    // Exibindo a janela de diálogo com os campos de edição
    int result = JOptionPane.showConfirmDialog(jTableTasks, editPanel, "Editar Tarefa", JOptionPane.OK_CANCEL_OPTION);
    
    // Verificando se o usuário clicou em "OK"
    if (result == JOptionPane.OK_OPTION) {
        // Obtendo os novos valores do nome e descrição da tarefa
        String newTaskName = nameField.getText();
        String newTaskDescription = descriptionArea.getText();
        
         // Atualizando a tarefa com os novos valores
        task.setName(newTaskName);
        task.setDescription(newTaskDescription);
        
        // Chamando o método de atualização da tarefa no controlador
        taskController.update(task);
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
        
    }
                
               
    break;
               
                
                
                
            case 5:
                taskController.removeById(task.getId());
                tasksModel.getTasks().remove(task);
                
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                
                break;
    }
        
        
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
        // TODO add your handling code here:
        int projectIndex = jListProjects.getSelectedIndex();
        Project project =(Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
        
        
    }//GEN-LAST:event_jListProjectsMouseClicked
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainScreen().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListTitle;
    private javax.swing.JLabel jLabelEmptyListsubTitle;
    private javax.swing.JLabel jLabelProjectsAdd;
    private javax.swing.JLabel jLabelProjectsTitle;
    private javax.swing.JLabel jLabelTasksAdd;
    private javax.swing.JLabel jLabelTasksTitle;
    private javax.swing.JLabel jLabelTooBarSubTitle;
    private javax.swing.JLabel jLabelTooBarTitle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelProjects;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JPanel jPanelTooBar;
    private javax.swing.JScrollPane jScrollPaneProjects;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables

    
    
public void decorateTableTasks(){
    
    //customizando a header da tabela de tarefas.
    jTableTasks.getTableHeader().setFont (new Font("Segoe UI", Font.BOLD, 14));
    jTableTasks.getTableHeader().setBackground (new Color(0, 153, 102));
    jTableTasks.getTableHeader().setForeground (new Color(0, 0, 0));
    
    jTableTasks.getColumnModel().getColumn(2)
            .setCellRenderer(new DeadlineColumnCellRederer());
    
    jTableTasks.getColumnModel().getColumn(4)
            .setCellRenderer(new ButtonColumnCellRederer("edit"));
    
    jTableTasks.getColumnModel().getColumn(5)
            .setCellRenderer(new ButtonColumnCellRederer("delete"));
    
    //Criando uma sort automatica para as colunas da tabela.
    //jTableTasks.setAutoCreateRowSorter(true);
}



public void initDataController(){
projectController = new ProjectController();
taskController = new TaskController();
 
}

public void initComponetsModel(){
    projectsModel = new DefaultListModel();
    loadProjects();
    
    tasksModel = new TaskTableModel();
    jTableTasks.setModel(tasksModel);
    
    
    
    if (!projectsModel.isEmpty()) {
            jListProjects.setSelectedIndex(0);
            int projectIndex = jListProjects.getSelectedIndex();
            Project project = (Project) projectsModel.get(projectIndex);
            loadTasks(project.getId());
        }
}

public void loadTasks(int idProject){
    List<Task> tasks = taskController.getAll(idProject);
    tasksModel.setTasks(tasks);
    showJTableTasks(!tasks.isEmpty());
}

public void showJTableTasks(boolean hasTasks){
    if(hasTasks){
        //Se existirem tarefas
        if (jPanelEmptyList.isVisible()){
            jPanelEmptyList.setVisible(false);
            jPanel7.remove(jPanelEmptyList);
            
        }
        
        jPanel7.add(jScrollPaneTasks);
        jScrollPaneTasks.setVisible(true);
        jScrollPaneTasks.setSize(jPanel7.getWidth(), jPanel7.getHeight());
    } else{
        if(jScrollPaneTasks.isVisible()){
            jScrollPaneTasks.setVisible(false);
            jPanel7.remove(jScrollPaneTasks);
            
        }
        jPanel7.add(jPanelEmptyList);
        jPanelEmptyList.setVisible(true);
        jPanelEmptyList.setSize(jPanel7.getWidth(), jPanel7.getHeight());
    }
}


public void loadProjects(){
    
    List<Project> projects = projectController.getAll();
    
    projectsModel.clear();
    
    for (int i = 0; i <projects.size(); i++){
        Project project = projects.get(i);
        projectsModel.addElement(project);
}
 
jListProjects.setModel(projectsModel);
    
    
}



}




