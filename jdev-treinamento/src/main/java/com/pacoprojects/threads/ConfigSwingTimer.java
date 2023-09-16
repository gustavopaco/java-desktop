package com.pacoprojects.threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConfigSwingTimer extends JDialog{
	
	private JPanel jPanel = new JPanel(new GridBagLayout());  	 /* PAINEL DE COMPONENTES. */
	
	private JLabel lblDescricaoHora = new JLabel("Tempo da Thread 1");
	private JTextField txtTempo = new JTextField();
	
	private JLabel lblDescricaoHora2 = new JLabel("Tempo da Thread 2");
	private JTextField txtTempo2 = new JTextField();
	
	private JButton btnStart = new JButton("Start");
	private JButton btnPause = new JButton("Pause");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) { /* THREAD LOOP INFINITO */
				try {
					txtTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread threadTempo1;
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				try {
					txtTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread threadTempo2;
	
	public ConfigSwingTimer() {    /* EXECUTA O QUE TIVER DENTRO NO MOMENTO DA ABERTURA OU EXECUCAO DO OBJETO/CLASSE. */
		
		/* PRIMEIRA PARTE DA INTERFACE SWING. */
		setTitle("Minha Tela de tempo com Thread"); 	/* TITULO DA INTERFACE */
		setSize(new Dimension(240, 240));  	/* TAMANHO DA INTERFACE LARGURA x ALTURA */
		setLocationRelativeTo(null); 	/*POSICIONAR JANELA DA INTERFACE RELATIVA A OUTRA, SE NULL, FICA CENTRALIZADA. */
		setResizable(false); 	/* NAO DEIXA AUMENTAR NEM DIMINUIR O TAMANHO DA INTERFACE*/
		/* PRIMEIRA PARTE CONCLUIDA. */
		
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); 	/* CONTROLADOR DE POSICIONAMENTO DE COMPONENTES. */
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2; 	/* A PARTIR DESSE MOMENTO A LARGURA QUE CADA COMPONENTE VAI OCUPAR EH 2 NA "TABELA EXCEL". */
		gridBagConstraints.insets = new Insets(5, 10, 5, 10);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		lblDescricaoHora.setPreferredSize(new Dimension(200, 25));		/* SETANDO LARGURA x ALTURA DO TEXTO DO LABEL */
		jPanel.add(lblDescricaoHora,gridBagConstraints);		/* COLOCANDO NO PAINEL O LABEL NA POSICAO SETADA DO GRID(0x,0y) */
		
		txtTempo.setPreferredSize(new Dimension(200, 25));
		txtTempo.setEditable(false);
		gridBagConstraints.gridy++;
		jPanel.add(txtTempo,gridBagConstraints);
		
		lblDescricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(lblDescricaoHora2,gridBagConstraints);
		
		txtTempo2.setPreferredSize(new Dimension(200, 25));
		txtTempo2.setEditable(false);
		gridBagConstraints.gridy++;
		jPanel.add(txtTempo2,gridBagConstraints);
		
		
		/* A PARTIR DESSE MOMENTO A LARGURA QUE CADA COMPONENTE VAI OCUPAR EH 1 NA "TABELA EXCEL". */
		gridBagConstraints.gridwidth = 1;
		
		btnStart.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(btnStart,gridBagConstraints);

		
		btnPause.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(btnPause,gridBagConstraints);

		
		btnPause.setEnabled(false);
		
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { 	/* EXECUTA O CLICK DO BOTAO. */
				threadTempo1 = new Thread(thread1);
				threadTempo2 = new Thread(thread2);
				threadTempo1.start();
				threadTempo2.start();
				btnPause.setEnabled(true);
				btnStart.setEnabled(false);
			}
		});
		
		btnPause.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	/* EXECUTA O CLICK DO BOTAO. */
				threadTempo1.stop();
				threadTempo2.stop();
				btnStart.setEnabled(true);
				btnPause.setEnabled(false);
			}
		});
		
		
		add(jPanel, BorderLayout.WEST);
		
		
		/* SEMPRE SERA O ULTIMO COMANDO. */
		setVisible(true); /* TORNA A TELA VISIVEL PARA O USUARIO. */
	}
	
}
