
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.*;
/*
Calculadora V2.0
@Alan de Jesus Fabian Garcia 
20310339
25 de Septiembre de 2021 */



public class Calculadora extends JFrame implements ActionListener{
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se= sem.getEngineByName("JavaScript");
    
    private JButton btnC;
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnpunto;
    private JButton btnDivision;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnMultiplicacion;
    private JButton btnIgual;
    private JPanel panel;
    private JPanel panelBtn;
    private JLabel  etiqueta;
    private JLabel resultado;


    public Calculadora(){
        super();
        configurarVentana();
        inicializarComponentes();
    }
    private void configurarVentana(){
        this.setTitle("Calculadora");
        this.setSize(340,500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public void inicializarComponentes(){
        //Creacion de los componentes
        this.panel = new JPanel();
        this.panelBtn= new JPanel();
        btnC = new JButton();
        btn0 = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7  = new JButton();
        btn8 = new JButton();
        btn9 = new JButton(); 
        btnpunto = new JButton();
        btnDivision = new JButton();
        btnSuma = new JButton();
        btnResta = new JButton();
        btnMultiplicacion= new JButton();
        btnIgual =new JButton();
        panel.setLayout(null);
        panelBtn.setLayout(null);

        this.etiqueta = new JLabel();
        etiqueta.setText("");
        
        panel.add(etiqueta);
        this.resultado= new JLabel ();
        resultado.setText("");
        panel.add(resultado);


       

       
        //Configuracion de estos
     
       
        //Botones
        //C
        btnC.setText("C");
        btnC.setBounds(10, 10,50,50);
        btnC.setFont(new Font("Roboto",Font.BOLD,18));
        btnC.addActionListener(this);
        btnC.setBackground(new Color(239,252,255));
        //0
        btn0.setText("0");
        btn0.setBounds(10,280,50,50);
        btn0.setFont(new Font("Roboto",Font.BOLD,18));
        btn0.setBackground(new Color(239,252,255));
        btn0.addActionListener(this);

        //1
        btn1.setText("1");
        btn1.setBounds(10,210, 50, 50);
        btn1.setFont(new Font("Roboto",Font.BOLD,18));
        btn1.setBackground(new Color(239,252,255));
        btn1.addActionListener(this);
        //2
        btn2.setText("2");
        btn2.setBounds(85,210,50,50);
        btn2.setFont(new Font("Roboto",Font.BOLD,18));
        btn2.setBackground(new Color(239,252,255));
        btn2.addActionListener(this);
        //3
        btn3.setText("3");
        btn3.setBounds(170,210,50,50);
        btn3.setFont(new Font("Roboto",Font.BOLD,18));
        btn3.setBackground(new Color(239,252,255));
        btn3.addActionListener(this);
        //4
        btn4.setText("4");
        btn4.setBounds(10,140,50,50);
        btn4.setFont(new Font("Roboto",Font.BOLD,18));
        btn4.setBackground(new Color(239,252,255));
        btn4.addActionListener(this);
        //5
        btn5.setText("5");
        btn5.setBounds(85,140,50,50);
        btn5.setFont(new Font("Roboto",Font.BOLD,18));
        btn5.setBackground(new Color(239,252,255));
        btn5.addActionListener(this);
        //6
        btn6.setText("6");
        btn6.setBounds(170,140,50,50);
        btn6.setFont(new Font("Roboto",Font.BOLD,18));
        btn6.setBackground(new Color(239,252,255));
        btn6.addActionListener(this);
        //7
        btn7.setText("7");
        btn7.setBounds(10,70,50,50);
        btn7.setFont(new Font("Roboto",Font.BOLD,18));
        btn7.setBackground(new Color(239,252,255));
        btn7.addActionListener(this);
        //8
        btn8.setText("8");
        btn8.setBounds(85, 70, 50, 50);
        btn8.setFont(new Font("Roboto",Font.BOLD,18));
        btn8.setBackground(new Color(239,252,255));
        btn8.addActionListener(this);
        //9
        btn9.setText("9");
        btn9.setBounds(170,70,50,50);
        btn9.setFont(new Font("Roboto",Font.BOLD,18));
        btn9.setBackground(new Color(239,252,255));
        btn9.addActionListener(this);
        //.
        btnpunto.setText(".");
        btnpunto.setBounds(85, 280, 50, 50);
        btnpunto.setFont(new Font("Roboto",Font.BOLD,18));
        btnpunto.setBackground(new Color(239,252,255));
        btnpunto.addActionListener(this);
        //botones de operaciones 
        btnSuma.setText("+");
        btnSuma.setBounds(260, 210, 50, 50);
        btnSuma.setFont(new Font("Roboto",Font.BOLD,18));
        btnSuma.setBackground(new Color(239,252,255));
        btnSuma.addActionListener(this);
        
        btnResta.setText("-");
        btnResta.setBounds(260, 140, 50, 50);
        btnResta.setFont(new Font("Roboto",Font.BOLD,18));
        btnResta.setBackground(new Color(239,252,255));
        btnResta.addActionListener(this);

        btnMultiplicacion.setText("x");
        btnMultiplicacion.setBounds(260, 70, 50, 50);
        btnMultiplicacion.setFont(new Font("Roboto",Font.BOLD,18));
        btnMultiplicacion.setBackground(new Color(239,252,255));
        btnMultiplicacion.addActionListener(this);

        btnDivision.setText(" / ");
        btnDivision.setBounds(260, 10, 50, 50);
        btnDivision.setFont(new Font("Roboto",Font.BOLD,18));
        btnDivision.setBackground(new Color(239,252,255));
        btnDivision.addActionListener(this);

        btnIgual.setText(" = ");
        btnIgual.setBounds(260, 280, 50, 50);
        btnIgual.setFont(new Font("Roboto",Font.BOLD,18));
        btnIgual.setBackground(new Color(239,252,255));
        btnIgual.addActionListener(this);

        


        //Caracteristicas de los paneles y etiquetas
        panel.setBackground(new Color(239,252,255));
    
        panel.setBounds(0, 0, 400, 120);
        panelBtn.setBackground(new Color(255,255,255));
        panelBtn.setBounds(0, 120, 400, 380);
        etiqueta.setBounds(10, 10, 320, 41);
        resultado.setBounds(10,42,320,40);
        etiqueta.setFont(new Font("Roboto",Font.BOLD,18));
        etiqueta.setForeground(new Color(60,66,81));
        etiqueta.setHorizontalAlignment(JLabel.RIGHT);
        resultado.setFont(new Font("Roboto Black",Font.PLAIN,36));
        resultado.setHorizontalAlignment(JLabel.RIGHT);
        resultado.setForeground(new Color(60,66,81));
        
      
  

        
        
        //Implementacion 
        this.getContentPane().add(panel);
        this.getContentPane().add(panelBtn);
        panelBtn.add(btnC);
        panelBtn.add(btn7);
        panelBtn.add(btn0);
        panelBtn.add(btn1);
        panelBtn.add(btn2);
        panelBtn.add(btn3);
        panelBtn.add(btn4);
        panelBtn.add(btn5);
        panelBtn.add(btn6);
        panelBtn.add(btn8);
        panelBtn.add(btn9);
        panelBtn.add(btnpunto);
        panelBtn.add(btnDivision);
        panelBtn.add(btnMultiplicacion);
        panelBtn.add(btnSuma);
        panelBtn.add(btnResta);
        panelBtn.add(btnIgual);
  
       

    


    }
    
    @Override
    //Funcionalidad de botones 
     public void actionPerformed(ActionEvent e) {  
       
        if(e.getSource()==btnC){
            this.etiqueta.setText("");
            this.resultado.setText("");
        
          
          
            
        }
        if(e.getSource()==btn0){
            addNumber("0");
            
        }
       

        if(e.getSource()==btn1){
            addNumber("1");
            
        }
       
        if(e.getSource()==btn2){
            addNumber("2");
            
        }
        if(e.getSource()==btn3){
            addNumber("3");
            
        }
        if(e.getSource()==btn4){
            addNumber("4");
            
        }
        if(e.getSource()==btn5){
            addNumber("5");
            
        }
        if(e.getSource()==btn6){
            addNumber("6");
            
        }
        if(e.getSource()==btn7){
            addNumber("7");
            
        }
        if(e.getSource()==btn8){
            addNumber("8");
            
        }
        if(e.getSource()==btn9){
            addNumber("9");
            
        }
        if(e.getSource()==btnpunto){
            addNumber(".");
           
            
        }
        if(e.getSource()==btnSuma){
            addNumber("+");
          
            
        }
        if(e.getSource()==btnResta){
            addNumber("-");
          
            
        }
        if(e.getSource()==btnDivision){
            addNumber("/");
          
            
        }
        if(e.getSource()==btnMultiplicacion){
            addNumber("*");
          
            
        }
        if(e.getSource()==btnIgual){
            try {
                String Resultado = se.eval(this.etiqueta.getText()).toString();
                this.resultado.setText(Resultado);
            } catch (Exception i) {
             
            }
            
          
            
        }
       
       
                                
        
    }
    public void addNumber(String digito){
        this.etiqueta.setText(this.etiqueta.getText()+digito);

    }
    
 
    

   

    

    public static void main(String[]args){
        //Creacion de los objetos ventana
        Calculadora Interfaz = new Calculadora();
        Interfaz.setVisible(true);
        



    }
    
}
    


