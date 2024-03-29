package com.golf.domain.skingame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.golf.domain.scorecard.Scorecard;
import com.golf.domain.skin.Skins;
import com.golf.domain.skingame.comparator.HoleEightComparator;
import com.golf.domain.skingame.comparator.HoleEighteenComparator;
import com.golf.domain.skingame.comparator.HoleElevenComparator;
import com.golf.domain.skingame.comparator.HoleFifteenComparator;
import com.golf.domain.skingame.comparator.HoleFiveComparator;
import com.golf.domain.skingame.comparator.HoleFourComparator;
import com.golf.domain.skingame.comparator.HoleFourteenComparator;
import com.golf.domain.skingame.comparator.HoleNineComparator;
import com.golf.domain.skingame.comparator.HoleOneComparator;
import com.golf.domain.skingame.comparator.HoleSevenComparator;
import com.golf.domain.skingame.comparator.HoleSeventeenComparator;
import com.golf.domain.skingame.comparator.HoleSixComparator;
import com.golf.domain.skingame.comparator.HoleSixteenComparator;
import com.golf.domain.skingame.comparator.HoleTenComparator;
import com.golf.domain.skingame.comparator.HoleThirteenComparator;
import com.golf.domain.skingame.comparator.HoleThreeComparator;
import com.golf.domain.skingame.comparator.HoleTwelveComparator;
import com.golf.domain.skingame.comparator.HoleTwoComparator;

// TODO: Auto-generated Javadoc
/**
 * The Class SkinGame.
 */
public class SkinGame
{
	
	/** The skin. */
	private Skins skin;
	
	/** The skins out. */
	private int skinsOut;
	
	/** The skin scorecards. */
	private List<SkinScorecard> skinScorecards;
	
	/**
	 * Instantiates a new skin game.
	 *
	 * @param skin the skin
	 */
	public SkinGame(Skins skin)
	{
		this.skin = skin;
		
		skinScorecards = new ArrayList<SkinScorecard>();
		
		if (skin.getScorecards().size() > 1)
		{
			for (Iterator<Scorecard> iterator = skin.getScorecards().iterator(); iterator.hasNext();)
			{
				Scorecard scorecard = (Scorecard) iterator.next();
				
				skinScorecards.add(new SkinScorecard(scorecard));
			}
			
			processScorecards();
		}
	}
	
	/**
	 * Process scorecards.
	 */
	private void processScorecards()
	{
		processHoleOne();
		processHoleTwo();
		processHoleThree();
		processHoleFour();
		processHoleFive();
		processHoleSix();
		processHoleSeven();
		processHoleEight();
		processHoleNine();
		processHoleTen();
		processHoleEleven();
		processHoleTwelve();
		processHoleThirteen();
		processHoleFourteen();
		processHoleFifteen();
		processHoleSixteen();
		processHoleSeventeen();
		processHoleEighteen();
		
	}
	
	/**
	 * Process hole one.
	 */
	private void processHoleOne()
	{
		Collections.sort(skinScorecards, new HoleOneComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getFirstHole();
		Hole scorecard2 = (skinScorecards.get(1)).getFirstHole();
		
		setSkin(scorecard1, scorecard2);		
	}
	
	/**
	 * Process hole two.
	 */
	private void processHoleTwo()
	{
		Collections.sort(skinScorecards, new HoleTwoComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getSecondHole();
		Hole scorecard2 = (skinScorecards.get(1)).getSecondHole();
		
		setSkin(scorecard1, scorecard2);		
	}
	
	/**
	 * Process hole three.
	 */
	private void processHoleThree()
	{
		Collections.sort(skinScorecards, new HoleThreeComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getThirdHole();
		Hole scorecard2 = (skinScorecards.get(1)).getThirdHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole four.
	 */
	private void processHoleFour()
	{
		Collections.sort(skinScorecards, new HoleFourComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getFourthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getFourthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole five.
	 */
	private void processHoleFive()
	{
		Collections.sort(skinScorecards, new HoleFiveComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getFifthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getFifthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole six.
	 */
	private void processHoleSix()
	{
		Collections.sort(skinScorecards, new HoleSixComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getSixthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getSixthHole();
		
		setSkin(scorecard1, scorecard2);	
		
	}
	
	/**
	 * Process hole seven.
	 */
	private void processHoleSeven()
	{
		Collections.sort(skinScorecards, new HoleSevenComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getSeventhHole();
		Hole scorecard2 = (skinScorecards.get(1)).getSeventhHole();
		
		setSkin(scorecard1, scorecard2);	
		
	}
	
	/**
	 * Process hole eight.
	 */
	private void processHoleEight()
	{
		Collections.sort(skinScorecards, new HoleEightComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getEigthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getEigthHole();
		
		setSkin(scorecard1, scorecard2);		
	}
	
	/**
	 * Process hole nine.
	 */
	private void processHoleNine()
	{
		Collections.sort(skinScorecards, new HoleNineComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getNinthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getNinthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole ten.
	 */
	private void processHoleTen()
	{
		Collections.sort(skinScorecards, new HoleTenComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getTenthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getTenthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole eleven.
	 */
	private void processHoleEleven()
	{
		Collections.sort(skinScorecards, new HoleElevenComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getEleventhHole();
		Hole scorecard2 = (skinScorecards.get(1)).getEleventhHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole twelve.
	 */
	private void processHoleTwelve()
	{
		Collections.sort(skinScorecards, new HoleTwelveComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getTwelthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getTwelthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole thirteen.
	 */
	private void processHoleThirteen()
	{
		Collections.sort(skinScorecards, new HoleThirteenComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getThirteenthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getThirteenthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole fourteen.
	 */
	private void processHoleFourteen()
	{
		Collections.sort(skinScorecards, new HoleFourteenComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getFourteenthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getFourteenthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole fifteen.
	 */
	private void processHoleFifteen()
	{
		Collections.sort(skinScorecards, new HoleFifteenComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getFifteenthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getFifteenthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole sixteen.
	 */
	private void processHoleSixteen()
	{
		Collections.sort(skinScorecards, new HoleSixteenComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getSixteenthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getSixteenthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole seventeen.
	 */
	private void processHoleSeventeen()
	{
		Collections.sort(skinScorecards, new HoleSeventeenComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getSeventeenthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getSeventeenthHole();
		
		setSkin(scorecard1, scorecard2);	
	}
	
	/**
	 * Process hole eighteen.
	 */
	private void processHoleEighteen()
	{
		Collections.sort(skinScorecards, new HoleEighteenComparator());
		
		Hole scorecard1 = (skinScorecards.get(0)).getEighteenthHole();
		Hole scorecard2 = (skinScorecards.get(1)).getEighteenthHole();
		
		setSkin(scorecard1, scorecard2);	
	}

	/**
	 * Sets the skin.
	 *
	 * @param scorecard1 the scorecard1
	 * @param scorecard2 the scorecard2
	 */
	private void setSkin(Hole scorecard1, Hole scorecard2)
	{
		if (scorecard1.getScore() < scorecard2.getScore())
		{
			scorecard1.setSkin(true);
			skinsOut++;
		}
		
	}
	
	/**
	 * Gets the total players.
	 *
	 * @return the total players
	 */
	public String getTotalPlayers()
	{
		return skinScorecards.size() + "";
	}

	/**
	 * Gets the skin.
	 *
	 * @return the skin
	 */
	public Skins getSkin()
	{
		return skin;
	}

	/**
	 * Sets the skin.
	 *
	 * @param skin the new skin
	 */
	public void setSkin(Skins skin)
	{
		this.skin = skin;
	}

	/**
	 * Gets the skins out.
	 *
	 * @return the skins out
	 */
	public int getSkinsOut()
	{
		return skinsOut;
	}

	/**
	 * Sets the skins out.
	 *
	 * @param skinsOut the new skins out
	 */
	public void setSkinsOut(int skinsOut)
	{
		this.skinsOut = skinsOut;
	}
	
	/**
	 * Gets the skin scorecards.
	 *
	 * @return the skin scorecards
	 */
	public List<SkinScorecard> getSkinScorecards()
	{
		return skinScorecards;
	}

	/**
	 * Sets the skin scorecards.
	 *
	 * @param skinScorecards the new skin scorecards
	 */
	public void setSkinScorecards(List<SkinScorecard> skinScorecards)
	{
		this.skinScorecards = skinScorecards;
	}
}
