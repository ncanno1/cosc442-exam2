/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 * 
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by the Free 
 *  Software Foundation; either version 2 of the License, or (at your option) 
 *  any later version.
 * 
 *  This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 *  for more details.
 */
package megamek.common.weapons;


import megamek.common.IGame;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class KillerWhaleTHandler.
 *
 * @author Jay Lawson
 */
public class KillerWhaleTHandler extends TeleMissileHandler {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2536312899803153911L;

    /**
     * Instantiates a new killer whale t handler.
     *
     * @param t the t
     * @param w the w
     * @param g the g
     * @param s the s
     */
    public KillerWhaleTHandler(ToHitData t, WeaponAttackAction w, IGame g, Server s) {
        super(t, w, g, s);
    }
    
    /* (non-Javadoc)
     * @see megamek.common.weapons.WeaponHandler#getCapMisMod()
     */
    protected int getCapMisMod() {
        return 10;
    }

}