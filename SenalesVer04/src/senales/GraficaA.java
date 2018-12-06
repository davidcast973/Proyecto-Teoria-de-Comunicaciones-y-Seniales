/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package senales;

/**
 *
 * @author Dinn
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;

public class GraficaA extends JFrame{
    
    JPanel intro, intro2, grafg, grafh;
    JLabel g, h;
    int x, vx, vy;
    DecimalFormat df;
    float G1[],G2[],H1[],H2[];
    
    public GraficaA(float g1[], float g2[], float h1[], float h2[]){              
		super("Grafica de operaciones");
		
                g = new JLabel("Grafica de G");
                h = new JLabel("Grafica de H");
		intro = new JPanel();
                intro2 = new JPanel();
                
                G1 = new float[g1.length];
                G2 = new float[g2.length];
                H1 = new float[h1.length];
                H2 = new float[h2.length];
                
                for(x=0;x<g1.length;x++)
                    G1[x]=g1[x];
                for(x=0;x<g2.length;x++)
                    G2[x]=g2[x];
                for(x=0;x<h1.length;x++)
                    H1[x]=h1[x];
                for(x=0;x<h2.length;x++)
                    H2[x]=h2[x];
                
                //this.getContentPane().setLayout (new GridLayout(2,2));
                intro.setLayout(new GridLayout(1,2));
		intro2.setLayout(new GridLayout(1,2));
                
                df = new DecimalFormat("#.##");
		
                GridBagConstraints constraints = new GridBagConstraints();
                constraints.gridx = 0; 
                constraints.gridy = 0; 
                constraints.gridwidth = 3; 
                constraints.gridheight = 1; 
                
		//this.getContentPane().add(g);
                intro.add(g);
                
                constraints.gridx = 3; 
                constraints.gridy = 0; 
                constraints.gridwidth = 3; 
                constraints.gridheight = 1; 
		this.getContentPane().add(h);
                
		
		intro.add(h);
		
		add("North", intro);
                //------------------------------------------
                
		grafg = new JPanel(){
			
			public void paint(Graphics g){
				super.paint(g);
				g.setColor(Color.black);
				g.drawLine(250,0,250,500);
				g.drawLine(0,250,500,250);
                                
                               // g.drawOval(250-Integer.parseInt(r.getText()) * 10, 250-Integer.parseInt(r.getText()) * 10, Integer.parseInt(r.getText()) * 20,Integer.parseInt(r.getText()) * 20);
                               // g.drawString(""+Integer.parseInt(r.getText()) + "i", 250, 245 - Integer.parseInt(r.getText()) * 10);
                                //g.drawLine(250,220,252,219);
                                for(x=0; x<16; x++)
                                    g.drawString(""+x, 250+x*15, 260);
                                for(x=0; x<16; x++)
                                    g.drawString(""+(0-x), 245-x*15, 250);
                                for(x=0; x<16; x++)
                                    g.drawString(""+x, 250, 250-x*15);
                                for(x=0; x<16; x++)
                                    g.drawString(""+(0-x), 240, 260+x*15);
                                
                                g.setColor(Color.blue);
                                for(x=0;x<G2.length;x++){
                                    vx = (int)(G2[x]);
                                    g.drawLine(235-x*15, 254-vx*15, 235-x*15, 250);
                                    g.drawString(""+df.format(G2[x]), 232-x*15, 249-vx*15);
                                }
                                
                                for(x=0;x<G1.length;x++){
                                    vx = (int)(G1[x]);
                                    g.drawLine(250+x*15, 254-vx*15, 250+x*15, 250);
                                    g.drawString(""+df.format(G1[x]), 245+x*15, 249-vx*15);
                                }
                                
                                //g.setColor(new Color((int) Math.round((Math.random()*255)), (int) Math.round((Math.random()*255)), (int) Math.round((Math.random()*255))));
                                
                                //g.drawLine(0,250,500,250);
                                //g.drawString(""+df.format(roots[a])+","+df.format(iroots[a]),252+vx,248-vy);
			}
		};
		grafg.setSize(500,500);
                
                constraints.gridx = 0; 
                constraints.gridy = 1; 
                constraints.gridwidth = 3; 
                constraints.gridheight = 3; 
                
		//this.getContentPane().add(grafg);
		
                intro2.add(grafg);
                //add("Center", grafg);
                
                //---------------------------------------------------
                
                
                grafh = new JPanel(){
			
			public void paint(Graphics g){
				super.paint(g);
				g.setColor(Color.black);
				g.drawLine(250,0,250,500);
				g.drawLine(0,250,500,250);
                                
                              //  g.drawOval(250-Integer.parseInt(r.getText()) * 10, 250-Integer.parseInt(r.getText()) * 10, Integer.parseInt(r.getText()) * 20,Integer.parseInt(r.getText()) * 20);
                              //  g.drawString(""+Integer.parseInt(r.getText()) + "i", 250, 245 - Integer.parseInt(r.getText()) * 10);
                                for(x=0; x<16; x++)
                                    g.drawString(""+x, 250+x*15, 260);
                                for(x=0; x<16; x++)
                                    g.drawString(""+(0-x), 245-x*15, 250);
                                for(x=0; x<16; x++)
                                    g.drawString(""+x, 250, 250-x*15);
                                for(x=0; x<16; x++)
                                    g.drawString(""+(0-x), 240, 260+x*15);
                                
                                
                                g.setColor(Color.red);
                                for(x=0;x<H2.length;x++){
                                    vx = (int)(H2[x]);
                                    g.drawLine(235-x*15, 254-vx*15, 235-x*15, 250);
                                    g.drawString(""+df.format(H2[x]), 232-x*15, 249-vx*15);
                                }
                                
                                for(x=0;x<H1.length;x++){
                                    vx = (int)(H1[x]);
                                    g.drawLine(250+x*15, 254-vx*15, 250+x*15, 250);
                                    g.drawString(""+df.format(H1[x]), 245+x*15, 249-vx*15);
                                }
                                
                                
			}
		};
		grafh.setSize(500,500);
                
                constraints.gridx = 3; 
                constraints.gridy = 1; 
                constraints.gridwidth = 3; 
                constraints.gridheight = 3; 
                
		//this.getContentPane().add(grafh);
                //add("Center", grafh);
                intro2.add(grafh);
                
                add("Center", intro2);
                //------------------------------------
		
		setSize(1050, 570);
		setVisible(true);  
		/* addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent winEvent) {
					System.exit(0);
				}
		}); */
		
   	 	grafg.repaint();
                grafh.repaint();
	}
    
    
}
