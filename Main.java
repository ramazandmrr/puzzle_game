import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
public class Main{    
    public static void main(String[] args) {   
    JFrame f = new JFrame("PUZZLE GAME");
    JLabel l1 = new JLabel();
    l1.setText("PUZZLE GAME");
    l1.setBounds(260, 15, 300, 30);
    l1.setFont(new Font("sansserif", Font.BOLD, 36));
    f.add(l1);
    Icon bos = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\bos.png");
    Icon fotorj = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\ronaldo.jpg");
    Icon foto1 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\1.jpg");
    Icon foto2 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\2.jpg");
    Icon foto3 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\3.jpg");
    Icon foto4 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\4.jpg");
    Icon foto5 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\5.jpg");
    Icon foto6 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\6.jpg");
    Icon foto7 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\7.jpg");
    Icon foto8 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\8.jpg");
    Icon foto9 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\9.jpg");
    Icon foto10 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\10.jpg");
    Icon foto11 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\11.jpg");
    Icon foto12 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\12.jpg");
    Icon foto13 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\13.jpg");
    Icon foto14 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\14.jpg");
    Icon foto15 = new ImageIcon("C:\\Users\\Ramazan\\Desktop\\ronaldo\\15.jpg"); 
    JButton bt1 = new JButton(foto14);JButton bt2 = new JButton(foto15);JButton bt3 = new JButton(foto4);JButton bt4 = new JButton(foto6);
    JButton bt5 = new JButton(foto13);JButton bt6 = new JButton(foto3);JButton bt7 = new JButton(foto7);JButton bt8 = new JButton(foto10);
    JButton bt9 = new JButton(foto1);JButton bt10 = new JButton(foto9);JButton bt11 = new JButton(foto8);JButton bt12 = new JButton(foto11);
    JButton bt13 = new JButton(foto2);JButton bt14 = new JButton(foto5);JButton bt15 = new JButton(foto12);JButton bt16 = new JButton(bos);
    JButton bt17 = new JButton(fotorj);JButton bt18 = new JButton("0");
    f.add(bt1);f.add(bt2);f.add(bt3);f.add(bt4);f.add(bt5);f.add(bt6);f.add(bt7);f.add(bt8);f.add(bt9);
    f.add(bt10);f.add(bt11);f.add(bt12);f.add(bt13);f.add(bt14);f.add(bt15);f.add(bt16);
    f.add(bt17);f.add(bt18);
    bt18.setFont(new Font("sansserif", Font.BOLD, 20));    
    bt1.setBounds(30, 60, 100, 100);
    bt2.setBounds(130, 60, 100, 100);
    bt3.setBounds(230, 60, 100, 100);
    bt4.setBounds(330, 60, 100, 100);
    bt5.setBounds(30, 160, 100, 100);
    bt6.setBounds(130, 160, 100, 100);
    bt7.setBounds(230, 160, 100, 100);
    bt8.setBounds(330, 160, 100, 100);
    bt9.setBounds(30, 260, 100, 100);
    bt10.setBounds(130, 260, 100, 100);
    bt11.setBounds(230, 260, 100, 100);
    bt12.setBounds(330, 260, 100, 100);
    bt13.setBounds(30, 360, 100, 100);
    bt14.setBounds(130, 360, 100, 100);
    bt15.setBounds(230, 360, 100, 100);
    bt16.setBounds(330, 360, 100, 100);
    bt17.setBounds(480, 80, 300, 300);
    bt18.setBounds(600,390,70,70);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(850, 560);
    f.setLayout(null);
    f.setVisible(true);   
    bt16.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e){       
        if(e.getSource()==bt16){
            Icon s1 = bt16.getIcon();
            if(bt15.getIcon()==bos){
                bt15.setIcon(s1);
                bt16.setIcon(bos);
                int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
                
     if(bt1.getIcon() == foto1 && bt2.getIcon() == foto2 && bt3.getIcon() == foto3 && bt4.getIcon() == foto4 && bt5.getIcon() == foto5 && bt6.getIcon() == foto6 &&
     bt7.getIcon() == foto7 && bt8.getIcon() == foto8 && bt9.getIcon() == foto9 && bt10.getIcon() == foto10 && bt11.getIcon() == foto11 && bt12.getIcon() == foto12 &&
     bt13.getIcon() == foto13 && bt14.getIcon() == foto14 && bt15.getIcon() == foto15 && bt16.getIcon() == bos){
         JOptionPane.showMessageDialog(null,"oyun bitmiştir");
     }
            }else if(bt12.getIcon()==bos){
                bt12.setIcon(s1);
                bt16.setIcon(bos);
                int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
                
     if(bt1.getIcon() == foto1 && bt2.getIcon() == foto2 && bt3.getIcon() == foto3 && bt4.getIcon() == foto4 && bt5.getIcon() == foto5 && bt6.getIcon() == foto6 &&
     bt7.getIcon() == foto7 && bt8.getIcon() == foto8 && bt9.getIcon() == foto9 && bt10.getIcon() == foto10 && bt11.getIcon() == foto11 && bt12.getIcon() == foto12 &&
     bt13.getIcon() == foto13 && bt14.getIcon() == foto14 && bt15.getIcon() == foto15 && bt16.getIcon() == bos){
         JOptionPane.showMessageDialog(null,"oyun bitmiştir");
     }
            }
        }                
       }        
    });    
    bt15.addActionListener(new ActionListener() {               
        @Override
        public void actionPerformed(ActionEvent e){
          
         if(e.getSource()==bt15){
             Icon s1 = bt15.getIcon();
             if(bt16.getIcon()==bos){
                 bt16.setIcon(s1);
                 bt15.setIcon(bos);
                 int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
                 
     if(bt1.getIcon() == foto1 && bt2.getIcon() == foto2 && bt3.getIcon() == foto3 && bt4.getIcon() == foto4 && bt5.getIcon() == foto5 && bt6.getIcon() == foto6 &&
     bt7.getIcon() == foto7 && bt8.getIcon() == foto8 && bt9.getIcon() == foto9 && bt10.getIcon() == foto10 && bt11.getIcon() == foto11 && bt12.getIcon() == foto12 &&
     bt13.getIcon() == foto13 && bt14.getIcon() == foto14 && bt15.getIcon() == foto15 && bt16.getIcon() == bos){
         JOptionPane.showMessageDialog(null,"oyun bitmiştir");
     }
             }else if(bt11.getIcon()==bos){
                 bt11.setIcon(s1);
                 bt15.setIcon(bos);
                 int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
                 
     if(bt1.getIcon() == foto1 && bt2.getIcon() == foto2 && bt3.getIcon() == foto3 && bt4.getIcon() == foto4 && bt5.getIcon() == foto5 && bt6.getIcon() == foto6 &&
     bt7.getIcon() == foto7 && bt8.getIcon() == foto8 && bt9.getIcon() == foto9 && bt10.getIcon() == foto10 && bt11.getIcon() == foto11 && bt12.getIcon() == foto12 &&
     bt13.getIcon() == foto13 && bt14.getIcon() == foto14 && bt15.getIcon() == foto15 && bt16.getIcon() == bos){
         JOptionPane.showMessageDialog(null,"oyun bitmiştir");
     }
             }else if(bt14.getIcon()==bos){
                bt14.setIcon(s1);
                bt15.setIcon(bos);
                int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
                
     if(bt1.getIcon() == foto1 && bt2.getIcon() == foto2 && bt3.getIcon() == foto3 && bt4.getIcon() == foto4 && bt5.getIcon() == foto5 && bt6.getIcon() == foto6 &&
     bt7.getIcon() == foto7 && bt8.getIcon() == foto8 && bt9.getIcon() == foto9 && bt10.getIcon() == foto10 && bt11.getIcon() == foto11 && bt12.getIcon() == foto12 &&
     bt13.getIcon() == foto13 && bt14.getIcon() == foto14 && bt15.getIcon() == foto15 && bt16.getIcon() == bos){
         JOptionPane.showMessageDialog(null,"oyun bitmiştir");
     }
            }
         }       
        } 
     }); 
    bt14.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt14){
             Icon s1 = bt14.getIcon();
             if(bt15.getIcon()==bos){
                 bt15.setIcon(s1);
                 bt14.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt10.getIcon()==bos){
                 bt10.setIcon(s1);
                 bt14.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt13.getIcon()==bos){
                bt13.setIcon(s1);
                bt14.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });
    bt13.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt13){
             Icon s1 = bt13.getIcon();
             if(bt14.getIcon()==bos){
                 bt14.setIcon(s1);
                 bt13.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt9.getIcon()==bos){
                 bt9.setIcon(s1);
                 bt13.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });  
    bt12.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt12){
             Icon s1 = bt12.getIcon();
             if(bt11.getIcon()==bos){
                 bt11.setIcon(s1);
                 bt12.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
                 if(bt1.getIcon() == foto1 && bt2.getIcon() == foto2 && bt3.getIcon() == foto3 && bt4.getIcon() == foto4 && bt5.getIcon() == foto5 && bt6.getIcon() == foto6 &&
               bt7.getIcon() == foto7 && bt8.getIcon() == foto8 && bt9.getIcon() == foto9 && bt10.getIcon() == foto10 && bt11.getIcon() == foto11 && bt12.getIcon() == foto12 &&
               bt13.getIcon() == foto13 && bt14.getIcon() == foto14 && bt15.getIcon() == foto15 && bt16.getIcon() == bos){
                   JOptionPane.showMessageDialog(null,"oyun bitmiştir");
               }
             }else if(bt16.getIcon()==bos){
                 bt16.setIcon(s1);
                 bt12.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
                 if(bt1.getIcon() == foto1 && bt2.getIcon() == foto2 && bt3.getIcon() == foto3 && bt4.getIcon() == foto4 && bt5.getIcon() == foto5 && bt6.getIcon() == foto6 &&
               bt7.getIcon() == foto7 && bt8.getIcon() == foto8 && bt9.getIcon() == foto9 && bt10.getIcon() == foto10 && bt11.getIcon() == foto11 && bt12.getIcon() == foto12 &&
               bt13.getIcon() == foto13 && bt14.getIcon() == foto14 && bt15.getIcon() == foto15 && bt16.getIcon() == bos){
                   JOptionPane.showMessageDialog(null,"oyun bitmiştir");
               }
             }else if(bt8.getIcon()==bos){
                bt8.setIcon(s1);
                bt12.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
                if(bt1.getIcon() == foto1 && bt2.getIcon() == foto2 && bt3.getIcon() == foto3 && bt4.getIcon() == foto4 && bt5.getIcon() == foto5 && bt6.getIcon() == foto6 &&
              bt7.getIcon() == foto7 && bt8.getIcon() == foto8 && bt9.getIcon() == foto9 && bt10.getIcon() == foto10 && bt11.getIcon() == foto11 && bt12.getIcon() == foto12 &&
              bt13.getIcon() == foto13 && bt14.getIcon() == foto14 && bt15.getIcon() == foto15 && bt16.getIcon() == bos){
                  JOptionPane.showMessageDialog(null,"oyun bitmiştir");
              }
             }
         }        
        }  
     });
    bt11.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt11){
             Icon s1 = bt11.getIcon();
             if(bt12.getIcon()==bos){
                 bt12.setIcon(s1);
                 bt11.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt7.getIcon()==bos){
                 bt7.setIcon(s1);
                 bt11.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt10.getIcon()==bos){
                bt10.setIcon(s1);
                bt11.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt15.getIcon()==bos){
                bt15.setIcon(s1);
                bt11.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });
    bt10.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt10){
             Icon s1 = bt10.getIcon();
             if(bt11.getIcon()==bos){
                 bt11.setIcon(s1);
                 bt10.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt14.getIcon()==bos){
                 bt14.setIcon(s1);
                 bt10.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt6.getIcon()==bos){
                bt6.setIcon(s1);
                bt10.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt9.getIcon()==bos){
                bt9.setIcon(s1);
                bt10.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });
    bt9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt9){
             Icon s1 = bt9.getIcon();
             if(bt10.getIcon()==bos){
                 bt10.setIcon(s1);
                 bt9.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt13.getIcon()==bos){
                 bt13.setIcon(s1);
                 bt9.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt5.getIcon()==bos){
                bt5.setIcon(s1);
                bt9.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });
    bt8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt8){
             Icon s1 = bt8.getIcon();
             if(bt12.getIcon()==bos){
                 bt12.setIcon(s1);
                 bt8.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt7.getIcon()==bos){
                 bt7.setIcon(s1);
                 bt8.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt4.getIcon()==bos){
                bt4.setIcon(s1);
                bt8.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });
    bt7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt7){
             Icon s1 = bt7.getIcon();
             if(bt3.getIcon()==bos){
                 bt3.setIcon(s1);
                 bt7.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt6.getIcon()==bos){
                 bt6.setIcon(s1);
                 bt7.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt8.getIcon()==bos){
                bt8.setIcon(s1);
                bt7.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt11.getIcon()==bos){
                bt11.setIcon(s1);
                bt7.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });
    bt6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt6){
             Icon s1 = bt6.getIcon();
             if(bt2.getIcon()==bos){
                 bt2.setIcon(s1);
                 bt6.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt5.getIcon()==bos){
                 bt5.setIcon(s1);
                 bt6.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt7.getIcon()==bos){
                bt7.setIcon(s1);
                bt6.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt10.getIcon()==bos){
                bt10.setIcon(s1);
                bt6.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });
    bt5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt5){
             Icon s1 = bt5.getIcon();
             if(bt1.getIcon()==bos){
                 bt1.setIcon(s1);
                 bt5.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt6.getIcon()==bos){
                 bt6.setIcon(s1);
                 bt5.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt9.getIcon()==bos){
                bt9.setIcon(s1);
                bt5.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });
    bt4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt4){
             Icon s1 = bt4.getIcon();
             if(bt3.getIcon()==bos){
                 bt3.setIcon(s1);
                 bt4.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt8.getIcon()==bos){
                 bt8.setIcon(s1);
                 bt4.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });  
    bt3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt3){
             Icon s1 = bt3.getIcon();
             if(bt4.getIcon()==bos){
                 bt4.setIcon(s1);
                 bt3.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt2.getIcon()==bos){
                 bt2.setIcon(s1);
                 bt3.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt7.getIcon()==bos){
                bt7.setIcon(s1);
                bt3.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
            }
         }        
        }  
     });  
    bt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt2){
             Icon s1 = bt2.getIcon();
             if(bt1.getIcon()==bos){
                 bt1.setIcon(s1);
                 bt2.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt3.getIcon()==bos){
                 bt3.setIcon(s1);
                 bt2.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt6.getIcon()==bos){
                bt6.setIcon(s1);
                bt2.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
            }
         }        
        }  
     });  
    bt1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
         if(e.getSource()==bt1){
             Icon s1 = bt1.getIcon();
             if(bt2.getIcon()==bos){
                 bt2.setIcon(s1);
                 bt1.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }else if(bt5.getIcon()==bos){
                 bt5.setIcon(s1);
                 bt1.setIcon(bos);int a = Integer.valueOf(bt18.getText()); a = a+1;String b = String.valueOf(a);bt18.setText(b);
             }
         }        
        }  
     });
    
}     

}    