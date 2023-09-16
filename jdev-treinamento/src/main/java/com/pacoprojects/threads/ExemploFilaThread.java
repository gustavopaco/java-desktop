package com.pacoprojects.threads;

import com.pacoprojects.threads.model.ImplementacaoFilaThread;
import com.pacoprojects.threads.model.ObjetoFilaThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploFilaThread extends JDialog{
	
	private JPanel jPanel = new JPanel(new GridBagLayout());  	 /* PAINEL DE COMPONENTES. */
	
	private JLabel lblDescricaoHora = new JLabel("Informe seu nome:");
	private JTextField txtTempo = new JTextField();
	
	private JLabel lblDescricaoHora2 = new JLabel("Informe seu e-mail");
	private JTextField txtTempo2 = new JTextField();
	
	private JButton btnStart = new JButton("Add Lista");
	private JButton btnPause = new JButton("Pause");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	
	public ExemploFilaThread() {    /* EXECUTA O QUE TIVER DENTRO NO MOMENTO DA ABERTURA OU EXECUCAO DO OBJETO/CLASSE. */
		
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
		gridBagConstraints.gridy++;
		jPanel.add(txtTempo,gridBagConstraints);
		
		lblDescricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(lblDescricaoHora2,gridBagConstraints);
		
		txtTempo2.setPreferredSize(new Dimension(200, 25));
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

		
		
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { 	/* EXECUTA O CLICK DO BOTAO. */
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				for(int i = 0 ; i < 10; i++) {
					ObjetoFilaThread objetoFilaThread = new ObjetoFilaThread();
					objetoFilaThread.setNome(txtTempo.getText());
					objetoFilaThread.setEmail(txtTempo2.getText() + " - " + i);
					fila.add(objetoFilaThread);
//					txtTempo.setText("");
//					txtTempo2.setText("");
				}
					
				
			}
		});
		
		btnPause.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	/* EXECUTA O CLICK DO BOTAO. */
				fila.stop();
				fila = null;
			}
		});
		
		fila.start();
		
		
		add(jPanel, BorderLayout.WEST);
		
		
		/* SEMPRE SERA O ULTIMO COMANDO. */
		setVisible(true); /* TORNA A TELA VISIVEL PARA O USUARIO. */
	}
	
}
