package com.golf.domain.skingame;

import com.golf.domain.player.Player;
import com.golf.domain.scorecard.Scorecard;

// TODO: Auto-generated Javadoc
/**
 * The Class SkinScorecard.
 */
public class SkinScorecard
{
	
	/** The player. */
	private Player player;
	
	/** The first hole. */
	private Hole firstHole;
	
	/** The second hole. */
	private Hole secondHole;
	
	/** The third hole. */
	private Hole thirdHole;
	
	/** The fourth hole. */
	private Hole fourthHole;
	
	/** The fifth hole. */
	private Hole fifthHole;
	
	/** The sixth hole. */
	private Hole sixthHole;
	
	/** The seventh hole. */
	private Hole seventhHole;
	
	/** The eigth hole. */
	private Hole eigthHole;
	
	/** The ninth hole. */
	private Hole ninthHole;
	
	/** The tenth hole. */
	private Hole tenthHole;
	
	/** The eleventh hole. */
	private Hole eleventhHole;
	
	/** The twelth hole. */
	private Hole twelthHole;
	
	/** The thirteenth hole. */
	private Hole thirteenthHole;
	
	/** The fourteenth hole. */
	private Hole fourteenthHole;
	
	/** The fifteenth hole. */
	private Hole fifteenthHole;
	
	/** The sixteenth hole. */
	private Hole sixteenthHole;
	
	/** The seventeenth hole. */
	private Hole seventeenthHole;
	
	/** The eighteenth hole. */
	private Hole eighteenthHole;
	
	/**
	 * Instantiates a new skin scorecard.
	 *
	 * @param scorecard the scorecard
	 */
	public SkinScorecard(Scorecard scorecard)
	{
		//player = scorecard.getPlayer();
		
		firstHole = new Hole(scorecard.getFirstHole());
		secondHole = new Hole(scorecard.getSecondHole());
		thirdHole = new Hole(scorecard.getThirdHole());
		fourthHole = new Hole(scorecard.getFourthHole());
		fifthHole = new Hole(scorecard.getFifthHole());
		sixthHole = new Hole(scorecard.getSixthHole());
		seventhHole = new Hole(scorecard.getSeventhHole());
		eigthHole = new Hole(scorecard.getEigthHole());
		ninthHole = new Hole(scorecard.getNinthHole());
		tenthHole = new Hole(scorecard.getTenthHole());
		eleventhHole = new Hole(scorecard.getEleventhHole());
		twelthHole = new Hole(scorecard.getTwelthHole());
		thirteenthHole = new Hole(scorecard.getThirteenthHole());
		fourteenthHole = new Hole(scorecard.getFourteenthHole());
		fifteenthHole = new Hole(scorecard.getFifteenthHole());
		sixteenthHole = new Hole(scorecard.getSixteenthHole());
		seventeenthHole = new Hole(scorecard.getSeventeenthHole());
		eighteenthHole = new Hole(scorecard.getEighteenthHole());
	}
	
	/**
	 * Gets the player.
	 *
	 * @return the player
	 */
	public Player getPlayer()
	{
		return player;
	}
	
	/**
	 * Sets the player.
	 *
	 * @param player the new player
	 */
	public void setPlayer(Player player)
	{
		this.player = player;
	}
	
	/**
	 * Gets the first hole.
	 *
	 * @return the first hole
	 */
	public Hole getFirstHole()
	{
		return firstHole;
	}
	
	/**
	 * Sets the first hole.
	 *
	 * @param firstHole the new first hole
	 */
	public void setFirstHole(Hole firstHole)
	{
		this.firstHole = firstHole;
	}
	
	/**
	 * Gets the second hole.
	 *
	 * @return the second hole
	 */
	public Hole getSecondHole()
	{
		return secondHole;
	}
	
	/**
	 * Sets the second hole.
	 *
	 * @param secondHole the new second hole
	 */
	public void setSecondHole(Hole secondHole)
	{
		this.secondHole = secondHole;
	}
	
	/**
	 * Gets the third hole.
	 *
	 * @return the third hole
	 */
	public Hole getThirdHole()
	{
		return thirdHole;
	}
	
	/**
	 * Sets the third hole.
	 *
	 * @param thirdHole the new third hole
	 */
	public void setThirdHole(Hole thirdHole)
	{
		this.thirdHole = thirdHole;
	}
	
	/**
	 * Gets the fourth hole.
	 *
	 * @return the fourth hole
	 */
	public Hole getFourthHole()
	{
		return fourthHole;
	}
	
	/**
	 * Sets the fourth hole.
	 *
	 * @param fourthHole the new fourth hole
	 */
	public void setFourthHole(Hole fourthHole)
	{
		this.fourthHole = fourthHole;
	}
	
	/**
	 * Gets the fifth hole.
	 *
	 * @return the fifth hole
	 */
	public Hole getFifthHole()
	{
		return fifthHole;
	}
	
	/**
	 * Sets the fifth hole.
	 *
	 * @param fifthHole the new fifth hole
	 */
	public void setFifthHole(Hole fifthHole)
	{
		this.fifthHole = fifthHole;
	}
	
	/**
	 * Gets the sixth hole.
	 *
	 * @return the sixth hole
	 */
	public Hole getSixthHole()
	{
		return sixthHole;
	}
	
	/**
	 * Sets the sixth hole.
	 *
	 * @param sixthHole the new sixth hole
	 */
	public void setSixthHole(Hole sixthHole)
	{
		this.sixthHole = sixthHole;
	}
	
	/**
	 * Gets the seventh hole.
	 *
	 * @return the seventh hole
	 */
	public Hole getSeventhHole()
	{
		return seventhHole;
	}
	
	/**
	 * Sets the seventh hole.
	 *
	 * @param seventhHole the new seventh hole
	 */
	public void setSeventhHole(Hole seventhHole)
	{
		this.seventhHole = seventhHole;
	}
	
	/**
	 * Gets the eigth hole.
	 *
	 * @return the eigth hole
	 */
	public Hole getEigthHole()
	{
		return eigthHole;
	}
	
	/**
	 * Sets the eigth hole.
	 *
	 * @param eigthHole the new eigth hole
	 */
	public void setEigthHole(Hole eigthHole)
	{
		this.eigthHole = eigthHole;
	}
	
	/**
	 * Gets the ninth hole.
	 *
	 * @return the ninth hole
	 */
	public Hole getNinthHole()
	{
		return ninthHole;
	}
	
	/**
	 * Sets the ninth hole.
	 *
	 * @param ninthHole the new ninth hole
	 */
	public void setNinthHole(Hole ninthHole)
	{
		this.ninthHole = ninthHole;
	}
	
	/**
	 * Gets the tenth hole.
	 *
	 * @return the tenth hole
	 */
	public Hole getTenthHole()
	{
		return tenthHole;
	}
	
	/**
	 * Sets the tenth hole.
	 *
	 * @param tenthHole the new tenth hole
	 */
	public void setTenthHole(Hole tenthHole)
	{
		this.tenthHole = tenthHole;
	}
	
	/**
	 * Gets the eleventh hole.
	 *
	 * @return the eleventh hole
	 */
	public Hole getEleventhHole()
	{
		return eleventhHole;
	}
	
	/**
	 * Sets the eleventh hole.
	 *
	 * @param eleventhHole the new eleventh hole
	 */
	public void setEleventhHole(Hole eleventhHole)
	{
		this.eleventhHole = eleventhHole;
	}
	
	/**
	 * Gets the twelth hole.
	 *
	 * @return the twelth hole
	 */
	public Hole getTwelthHole()
	{
		return twelthHole;
	}
	
	/**
	 * Sets the twelth hole.
	 *
	 * @param twelthHole the new twelth hole
	 */
	public void setTwelthHole(Hole twelthHole)
	{
		this.twelthHole = twelthHole;
	}
	
	/**
	 * Gets the thirteenth hole.
	 *
	 * @return the thirteenth hole
	 */
	public Hole getThirteenthHole()
	{
		return thirteenthHole;
	}
	
	/**
	 * Sets the thirteenth hole.
	 *
	 * @param thirteenthHole the new thirteenth hole
	 */
	public void setThirteenthHole(Hole thirteenthHole)
	{
		this.thirteenthHole = thirteenthHole;
	}
	
	/**
	 * Gets the fourteenth hole.
	 *
	 * @return the fourteenth hole
	 */
	public Hole getFourteenthHole()
	{
		return fourteenthHole;
	}
	
	/**
	 * Sets the fourteenth hole.
	 *
	 * @param fourteenthHole the new fourteenth hole
	 */
	public void setFourteenthHole(Hole fourteenthHole)
	{
		this.fourteenthHole = fourteenthHole;
	}
	
	/**
	 * Gets the fifteenth hole.
	 *
	 * @return the fifteenth hole
	 */
	public Hole getFifteenthHole()
	{
		return fifteenthHole;
	}
	
	/**
	 * Sets the fifteenth hole.
	 *
	 * @param fifteenthHole the new fifteenth hole
	 */
	public void setFifteenthHole(Hole fifteenthHole)
	{
		this.fifteenthHole = fifteenthHole;
	}
	
	/**
	 * Gets the sixteenth hole.
	 *
	 * @return the sixteenth hole
	 */
	public Hole getSixteenthHole()
	{
		return sixteenthHole;
	}
	
	/**
	 * Sets the sixteenth hole.
	 *
	 * @param sixteenthHole the new sixteenth hole
	 */
	public void setSixteenthHole(Hole sixteenthHole)
	{
		this.sixteenthHole = sixteenthHole;
	}
	
	/**
	 * Gets the seventeenth hole.
	 *
	 * @return the seventeenth hole
	 */
	public Hole getSeventeenthHole()
	{
		return seventeenthHole;
	}
	
	/**
	 * Sets the seventeenth hole.
	 *
	 * @param seventeenthHole the new seventeenth hole
	 */
	public void setSeventeenthHole(Hole seventeenthHole)
	{
		this.seventeenthHole = seventeenthHole;
	}
	
	/**
	 * Gets the eighteenth hole.
	 *
	 * @return the eighteenth hole
	 */
	public Hole getEighteenthHole()
	{
		return eighteenthHole;
	}
	
	/**
	 * Sets the eighteenth hole.
	 *
	 * @param eighteenthHole the new eighteenth hole
	 */
	public void setEighteenthHole(Hole eighteenthHole)
	{
		this.eighteenthHole = eighteenthHole;
	}
}
