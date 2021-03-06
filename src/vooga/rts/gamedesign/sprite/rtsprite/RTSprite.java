package gamedesign.sprite.rtsprite;

import gamedesign.sprite.Sprite;
import gamedesign.strategy.attackstrategy.AttackStrategy;
import gamedesign.strategy.occupystrategy.OccupyStrategy;
import util.Sound;

/**
 * 
 * @author Ryan Fishel
 * @author Kevin Oh
 * @author Francesco Agosti
 * @author Wenshun Liu 
 *
 */
public abstract class RTSprite extends Sprite implements IAttackable, RTSpriteVisitor {

  public Integer curHealth;

  public OccupyStrategy myOccupyStrategy;

  public AttackStrategy myAttackStrategy;

  public Integer maxHealth;

  public Integer TeamID;

  public Sound mySound;

  /** 
   *  This would accept RTSpriteVisitors and behave according to the visitor's visit method. This code will always run RTSpriteVisitor.visit(this). "this" being the subclass of RTSprite. 
 * @return 
   */
  public void accept(RTSpriteVisitor visitor) {
  }

  public boolean interactsWith(RTSprite rtSprite) {
	return false;
  }

}