/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect.four.gui;

import connect.four.*;
import connect.four.board.*;
import connect.four.player.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class GamePanel extends javax.swing.JPanel implements ScoreChart.Listener {

	GUI gui;
	static final long GLOW_START_TIME = (int)System.currentTimeMillis();
	static final int PLAY_TIME = 1500;
	boolean falling;
	int columnNum;
	int turnNum;
	int whoPlayed;
	int newDrawPos;
	int newColumnNum;
	Player[] players;
	Game game;
	GUIPiece[] pieces;
	Board board;
	boolean isComputerEnabled;
	boolean justWon;
	
	public GamePanel(GUI gui, boolean isComputerEnabled) {
		//whoPlayed = 1;
		players = new Player[2];
		players[0] = new GUIPlayer(gui.getPlayer1Name(), this);
		this.isComputerEnabled = isComputerEnabled;
		if(!isComputerEnabled){
			players[1] = new GUIPlayer(gui.getPlayer2Name(), this);
		}
		else{
			players[1] = new GUIWrapperPlayer(new ComputerPlayer(), this);
		}
		setSize(1280, 800);
		initComponents();
		this.gui = gui;
		board = new Board(7,6);
		game = new Game(players,board, 4);
		game.start();
		game.registerListener(this);
		justWon = false;
		
		initNewGame();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                player1NameBox = new javax.swing.JLabel();
                currentWins = new javax.swing.JLabel();
                pNameDisplay = new javax.swing.JLabel();
                turnDisplay = new javax.swing.JLabel();
                col1 = new javax.swing.JPanel();
                col2 = new javax.swing.JPanel();
                col3 = new javax.swing.JPanel();
                col4 = new javax.swing.JPanel();
                col5 = new javax.swing.JPanel();
                col6 = new javax.swing.JPanel();
                topGlass = new javax.swing.JPanel();
                col7 = new javax.swing.JPanel();
                player2NameBox = new javax.swing.JLabel();
                bgImage = new javax.swing.JLabel();

                setBackground(new java.awt.Color(0, 0, 0));
                setPreferredSize(new java.awt.Dimension(1280, 800));
                addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                formMouseClicked(evt);
                        }
                });
                setLayout(null);

                player1NameBox.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
                player1NameBox.setForeground(new java.awt.Color(255, 255, 255));
                player1NameBox.setText("player 1");
                add(player1NameBox);
                player1NameBox.setBounds(1070, 40, 210, 40);

                currentWins.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
                currentWins.setForeground(new java.awt.Color(255, 255, 255));
                currentWins.setText("CURRENT WINS");
                add(currentWins);
                currentWins.setBounds(1070, 0, 200, 40);

                pNameDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
                pNameDisplay.setForeground(new java.awt.Color(255, 255, 255));
                pNameDisplay.setText("jLabel2");
                add(pNameDisplay);
                pNameDisplay.setBounds(1070, 210, 200, 40);

                turnDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
                turnDisplay.setForeground(new java.awt.Color(255, 255, 255));
                turnDisplay.setText("jLabel2");
                add(turnDisplay);
                turnDisplay.setBounds(1070, 150, 200, 40);

                col1.setBackground(new java.awt.Color(102, 102, 102));
                col1.setOpaque(false);
                col1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                col1MouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                col1MouseExited(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                col1MouseEntered(evt);
                        }
                });
                col1.setLayout(null);
                add(col1);
                col1.setBounds(0, 0, 310, 740);

                col2.setBackground(new java.awt.Color(102, 102, 102));
                col2.setOpaque(false);
                col2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                col2MouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                col2MouseExited(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                col2MouseEntered(evt);
                        }
                });
                col2.setLayout(null);
                add(col2);
                col2.setBounds(320, 0, 80, 740);

                col3.setBackground(new java.awt.Color(102, 102, 102));
                col3.setOpaque(false);
                col3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                col3MouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                col3MouseExited(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                col3MouseEntered(evt);
                        }
                });
                col3.setLayout(null);
                add(col3);
                col3.setBounds(410, 10, 80, 740);

                col4.setBackground(new java.awt.Color(102, 102, 102));
                col4.setOpaque(false);
                col4.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                col4MouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                col4MouseExited(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                col4MouseEntered(evt);
                        }
                });
                col4.setLayout(null);
                add(col4);
                col4.setBounds(500, -10, 80, 740);

                col5.setBackground(new java.awt.Color(102, 102, 102));
                col5.setOpaque(false);
                col5.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                col5MouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                col5MouseExited(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                col5MouseEntered(evt);
                        }
                });
                col5.setLayout(null);
                add(col5);
                col5.setBounds(590, 0, 80, 740);

                col6.setBackground(new java.awt.Color(102, 102, 102));
                col6.setOpaque(false);
                col6.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                col6MouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                col6MouseExited(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                col6MouseEntered(evt);
                        }
                });
                col6.setLayout(null);
                add(col6);
                col6.setBounds(680, -30, 80, 740);

                topGlass.setBackground(new java.awt.Color(102, 102, 102));
                topGlass.setOpaque(false);
                topGlass.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                topGlassMouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                topGlassMouseExited(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                topGlassMouseEntered(evt);
                        }
                });
                topGlass.setLayout(null);

                col7.setBackground(new java.awt.Color(102, 102, 102));
                col7.setOpaque(false);
                col7.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                col7MouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                col7MouseExited(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                col7MouseEntered(evt);
                        }
                });
                col7.setLayout(null);
                topGlass.add(col7);
                col7.setBounds(770, 0, 300, 740);

                player2NameBox.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
                player2NameBox.setForeground(new java.awt.Color(255, 255, 255));
                player2NameBox.setText("player 1");
                topGlass.add(player2NameBox);
                player2NameBox.setBounds(1070, 90, 210, 40);

                add(topGlass);
                topGlass.setBounds(0, 0, 1280, 800);

                bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board.png"))); // NOI18N
                bgImage.setText("jLabel1");
                bgImage.setIgnoreRepaint(true);
                add(bgImage);
                bgImage.setBounds(0, 150, 1070, 590);
        }// </editor-fold>//GEN-END:initComponents

        private void col1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col1MouseEntered
		calcNewPos(0);
		calcWidth(0);
        }//GEN-LAST:event_col1MouseEntered

        private void col1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col1MouseExited
	
        }//GEN-LAST:event_col1MouseExited

        private void col2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col2MouseExited
  
        }//GEN-LAST:event_col2MouseExited

        private void col2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col2MouseEntered
                calcNewPos(1);
		calcWidth(1);
        }//GEN-LAST:event_col2MouseEntered

        private void col4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col4MouseExited
                // TODO add your handling code here:
        }//GEN-LAST:event_col4MouseExited

        private void col4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col4MouseEntered
                calcNewPos(3);
		calcWidth(3);
        }//GEN-LAST:event_col4MouseEntered

        private void col5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col5MouseExited
                // TODO add your handling code here:
        }//GEN-LAST:event_col5MouseExited

        private void col5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col5MouseEntered
                calcNewPos(4);
		calcWidth(4);
        }//GEN-LAST:event_col5MouseEntered

        private void col6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col6MouseExited
                // TODO add your handling code here:
        }//GEN-LAST:event_col6MouseExited

        private void col6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col6MouseEntered
		calcNewPos(5);
		calcWidth(5);
        }//GEN-LAST:event_col6MouseEntered

        private void col7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col7MouseExited
                // TODO add your handling code here:
        }//GEN-LAST:event_col7MouseExited

        private void col7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col7MouseEntered
		calcNewPos(6);
		calcWidth(6);
        }//GEN-LAST:event_col7MouseEntered

        private void col3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col3MouseExited
                // TODO add your handling code here:
        }//GEN-LAST:event_col3MouseExited

        private void col3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col3MouseEntered
                calcNewPos(2);
		calcWidth(2);
        }//GEN-LAST:event_col3MouseEntered

        private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
  
        }//GEN-LAST:event_formMouseClicked

        private void col1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col1MouseClicked
                if (game.getCurrentPlayer() != players[1] || !isComputerEnabled) turn();
        }//GEN-LAST:event_col1MouseClicked

        private void col2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col2MouseClicked
                if (game.getCurrentPlayer() != players[1] || !isComputerEnabled) turn();
        }//GEN-LAST:event_col2MouseClicked

        private void col3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col3MouseClicked
                if (game.getCurrentPlayer() != players[1] || !isComputerEnabled) turn();
        }//GEN-LAST:event_col3MouseClicked

        private void col4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col4MouseClicked
                if (game.getCurrentPlayer() != players[1] || !isComputerEnabled) turn();
        }//GEN-LAST:event_col4MouseClicked

        private void col6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col6MouseClicked
                if (game.getCurrentPlayer() != players[1] || !isComputerEnabled) turn();
        }//GEN-LAST:event_col6MouseClicked

        private void col7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col7MouseClicked
                if (game.getCurrentPlayer() != players[1] || !isComputerEnabled) turn();
        }//GEN-LAST:event_col7MouseClicked

        private void col5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_col5MouseClicked
                if (game.getCurrentPlayer() != players[1] || !isComputerEnabled) turn();
        }//GEN-LAST:event_col5MouseClicked

        private void topGlassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topGlassMouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_topGlassMouseClicked

        private void topGlassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topGlassMouseExited
                // TODO add your handling code here:
        }//GEN-LAST:event_topGlassMouseExited

        private void topGlassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topGlassMouseEntered
                // TODO add your handling code here:
        }//GEN-LAST:event_topGlassMouseEntered

	
	void dropPiece(){
		falling = true;
		final int destination = getTargetY();
		final long startTime = System.currentTimeMillis();
		pieces[turnNum].setVisible(true);
		Timer timer = new Timer((8000/(destination)), new ActionListener() 
		{
		    @Override
                    public void actionPerformed(ActionEvent e) {
			int x = pieces[turnNum].getX();
			int y = pieces[turnNum].getY();
			int startY = y;
			long duration = System.currentTimeMillis() - startTime;
			float progress = (float)duration / (float)PLAY_TIME;
			
			if (progress > 1f) 
			{
				progress = 1f;
				((Timer)(e.getSource())).stop();
				falling = false;
				System.out.println("Piece fell.");
				if(!isComputerEnabled){
					GUIPlayer player = (GUIPlayer)game.getCurrentPlayer();
					player.getBoard().play(getColumnNum(), player);
				}
				else{
					if(game.getCurrentPlayer() == players[0]){
						GUIPlayer player = (GUIPlayer)game.getCurrentPlayer();
						player.getBoard().play(getColumnNum(), player);
					}
					else if(game.getCurrentPlayer() == players[1]){
						GUIWrapperPlayer player = (GUIWrapperPlayer)game.getCurrentPlayer();						   player.getBoard().play(getColumnNum(), player);
					}
					
				}
				turnUp();
			}
			y = y+(int)Math.round((destination - startY) * progress);
			pieces[turnNum].setLocation(x, y);
			if(y == getTargetY()){
				((Timer)(e.getSource())).stop();
				falling = false;
				System.out.println("Piece fell.");
				if(!isComputerEnabled){
					GUIPlayer player = (GUIPlayer)game.getCurrentPlayer();
					player.getBoard().play(getColumnNum(), player);
				}
				else{
					if(game.getCurrentPlayer() == players[0]){
						GUIPlayer player = (GUIPlayer)game.getCurrentPlayer();
						player.getBoard().play(getColumnNum(), player);
					}
					else if(game.getCurrentPlayer() == players[1]){
						GUIWrapperPlayer player = (GUIWrapperPlayer)game.getCurrentPlayer();						   player.getBoard().play(getColumnNum(), player);
					}
				}
				
				turnUp();
			}
		    }
		});
		timer.start();
	}
	
	
	
	
	public int getTargetY(){
		int height = board.getColumnHeight(getColumnNum());
		switch(height){
			case 0: 
				return 605;
			case 1:
				return 513;
			case 2:
				return 421;
			case 3:
				return 330;
			case 4:
				return 242;
			case 5:
				return 150;
			default:
				return 150;
		}
	}
	
	public boolean isValidMove(){
		boolean valid = true;
		if(board.getColumnHeight(getColumnNum()) > 5){
			valid = false;
		}
		return valid;
	}
	
	public int getColumnNum(){
		return columnNum;
	}
	
	public void calcWidth(int columnEntered){
		int xPos = 0;
		
		switch(columnEntered){
			case 0:
				xPos = 190;
				break;
			case 1:
				xPos = 280;
				break;
			case 2:
				xPos = 372;
				break;
			case 3:
				xPos = 463;
				break;
			case 4:
				xPos = 554;
				break;
			case 5:
				xPos = 645;
				break;
			case 6:
				xPos = 738;
				break;
			}
		
		
		
		if(falling == false){
			columnNum = columnEntered;
			pieces[turnNum].setLocation(xPos,0);
			revalidate();
			repaint();
		}
	}
	
	void calcNewPos(int columnEntered){
		int xPos = 0;
		
		switch(columnEntered){
			case 0:
				xPos = 190;
				break;
			case 1:
				xPos = 280;
				break;
			case 2:
				xPos = 372;
				break;
			case 3:
				xPos = 463;
				break;
			case 4:
				xPos = 554;
				break;
			case 5:
				xPos = 645;
				break;
			case 6:
				xPos = 738;
				break;
			}
		
		newDrawPos = xPos;
		newColumnNum = columnEntered;
		
	}
	
	void turnUp(){
		if(!justWon){
			if(falling == false){
				//move piece to top glass, for glow.
				glow(pieces[turnNum]);

				turnNum +=1;

				//Displays who is playing this turn
				if(turnNum%2 == 0){
					pNameDisplay.setForeground(Color.red);
				}
				else{
					pNameDisplay.setForeground(Color.blue);
				}

				//Turn goes up, unless there is a tie
				if(turnNum == 42){ // bug3
//					for (GUIPiece piece : pieces) {
//						piece.setIcon(null);
//						topGlass.remove(piece);
//					}
					gui.setWinner("It's a tie!");
					board.clear();
					initNewGame();
					gui.addGameOver();
				}
				else{
					pieces[turnNum] = new GUIPiece(turnNum%2);
					pieces[turnNum].setLocation(newDrawPos,0);
					if (game.getCurrentPlayer() == players[1]
					    && isComputerEnabled) {
						pieces[turnNum].setVisible(false);
					}
					columnNum = newColumnNum;
					System.out.println("Turn " + (turnNum+1) +" Started!");
					pNameDisplay.setText(game.getCurrentPlayer().getName() + "'s turn.");
					turnDisplay.setText("Round number " +(turnNum/2+1));
					add(pieces[turnNum]);
				}

				//Makes the round display turn red if there are 10 or less turns
				if(turnNum >= 32){
					//Turns red to show 10 turns left
					turnDisplay.setForeground(Color.red);
				}

				revalidate();
				repaint();


			}
		}
		else{
			justWon = false;
		}
	}
	
	public void turn(){
		if(falling == false && isValidMove()){
			System.out.println(getColumnNum());
			System.out.println(board.getColumnHeight(getColumnNum()));
			dropPiece();
		}
	}
	
	void initNewGame(){
		turnNum = 0;
		columnNum = 0;
		whoPlayed = 1;
		falling = false;
		pieces = new GUIPiece[43];
		pieces[turnNum] = new GUIPiece(turnNum);
		pieces[turnNum].setLocation(newDrawPos, 0);
		if (game.getCurrentPlayer() == players[1] && isComputerEnabled) {
			pieces[turnNum].setVisible(false);
		}
		add(pieces[turnNum]);
		pNameDisplay.setForeground(Color.red);
		pNameDisplay.setText(game.getCurrentPlayer().getName() + "'s turn.");
		turnDisplay.setForeground(Color.white);
		turnDisplay.setText("Round number " +(turnNum/2+1));
		player1NameBox.setText(players[0].getName() + ":    " + gui.getScore1());
		player2NameBox.setText(players[1].getName() + ":    " + gui.getScore2());
		setVisible(true);
	}
	
	void globalGlow(){
		
	}
	
	//GAME OVER
	@Override
	public void gameOver(Player winner, ScoreChart scores, ReadableBoard end) {
		if(turnNum < 41){
			if(game.getCurrentPlayer() == players[0]){
				gui.setScore1(gui.getScore1()+1);
			}
			else if(game.getCurrentPlayer() == players[1]){
				gui.setScore2(gui.getScore2()+1);
			}
			gui.setWinner(game.getCurrentPlayer().getName());
			
			board.clear();
			for (GUIPiece piece : pieces) {
						if(piece != null){
							piece.setIcon(null);
							topGlass.remove(piece);
						}
					}
					initNewGame();
					gui.addGameOver();
					justWon = true;
		}
	}
	
	
	
	void glow(GUIPiece currentPiece){
		final GUIPiece cP = currentPiece;
		topGlass.add(cP);
		Timer timer = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				long tick = GLOW_START_TIME - System.currentTimeMillis();
				tick = (-1*tick/100);
				//System.out.println(tick%6);
				cP.setIcon(cP.getGlow((int)tick%6));
				topGlass.invalidate();
				topGlass.revalidate();
				topGlass.repaint();
				}

			
		    
		});
		timer.setRepeats(true);
		timer.setCoalesce(true);
		timer.start();
	}
	

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel bgImage;
        private javax.swing.JPanel col1;
        private javax.swing.JPanel col2;
        private javax.swing.JPanel col3;
        private javax.swing.JPanel col4;
        private javax.swing.JPanel col5;
        private javax.swing.JPanel col6;
        private javax.swing.JPanel col7;
        private javax.swing.JLabel currentWins;
        private javax.swing.JLabel pNameDisplay;
        private javax.swing.JLabel player1NameBox;
        private javax.swing.JLabel player2NameBox;
        private javax.swing.JPanel topGlass;
        private javax.swing.JLabel turnDisplay;
        // End of variables declaration//GEN-END:variables

	
}
