package com.golf.domain.skingame;

// TODO: Auto-generated Javadoc
/**
 * The Class Hole.
 */
public class Hole
{
	
	/** The score. */
	private int score;
	
	/** The skin. */
	private boolean skin;
	
	/**
	 * Instantiates a new hole.
	 *
	 * @param score the score
	 */
	public Hole(int score)
	{
		this.score = score;
	}
	
	/**
	 * Gets the skin.
	 *
	 * @return the skin
	 */
	public boolean getSkin()
	{
		return skin;
	}

	/**
	 * Sets the skin.
	 *
	 * @param skin the new skin
	 */
	public void setSkin(boolean skin)
	{
		this.skin = skin;
	}

	/**
	 * Gets the score.
	 *
	 * @return the score
	 */
	public int getScore()
	{
		return score;
	}

	/**
	 * Sets the score.
	 *
	 * @param score the new score
	 */
	public void setScore(int score)
	{
		this.score = score;
	}
	
	
}
