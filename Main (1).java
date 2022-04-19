// Describe this function...
function
_tp_creative ()
{
  nextLocation =
    CMD.movePosition (player, startLocation, nextLocation.getYaw (),
		      nextLocation.getPitch (), "cartesian", 0, 0, 0);
  CMD.programWait (1000);
  CMD.createBlock (nextLocation,
		   "_G_,,_P_,,_D_,,_M_,,_T_,,_L_,,b.grass_block;", player,
		   startCmdTime);
}
