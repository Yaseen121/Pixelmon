package pixelmon.battles.attacks.specialAttacks.statusAppliers;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.battles.status.Bind;
import pixelmon.battles.status.StatusType;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class ApplyBind extends StatusApplierBase {

	@Override
	public void ApplyEffect(Attack a, double crit, EntityPixelmon user, EntityPixelmon target, ArrayList<String> attackList, ArrayList<String> targetAttackList) throws Exception {
		if (target.hasStatus(StatusType.Bind)) {
			ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), target.getNickname() + " is already bound!");
			
			return;
	}
		target.status.add(new Bind());
		ChatHandler.sendBattleMessage(user.getOwner(), target.getOwner(), target.getNickname() + " has been squeezed!");
		// TODO Auto-generated method stub
		
	}

}
