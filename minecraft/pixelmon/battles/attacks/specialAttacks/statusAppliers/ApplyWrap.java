package pixelmon.battles.attacks.specialAttacks.statusAppliers;

import java.util.ArrayList;
import pixelmon.battles.attacks.Attack;
import pixelmon.battles.status.Wrap;
import pixelmon.battles.status.StatusType;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class ApplyWrap extends StatusApplierBase {

	@Override
	public void ApplyEffect(Attack a, double crit, EntityPixelmon user, EntityPixelmon target, ArrayList<String> attackList, ArrayList<String> targetAttackList) throws Exception {
		if (target.hasStatus(StatusType.Wrap)) {
			ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), target.getNickname() + " is already wrapped!");
			
			return;
	}
		target.status.add(new Wrap());
		ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), target.getNickname() + " has been wrapped!");
		// TODO Auto-generated method stub
		
	}

}
