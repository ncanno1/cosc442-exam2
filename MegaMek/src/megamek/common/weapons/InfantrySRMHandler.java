/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
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
/*
 * Created on Sep 24, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.IGame;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

// TODO: Auto-generated Javadoc
/**
 * The Class InfantrySRMHandler.
 *
 * @author Sebastian Brocks
 */
public class InfantrySRMHandler extends InfantryWeaponHandler {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3172491536250588255L;

    /**
     * Instantiates a new infantry srm handler.
     *
     * @param t the t
     * @param w the w
     * @param g the g
     * @param s the s
     */
    public InfantrySRMHandler(ToHitData t, WeaponAttackAction w, IGame g,
            Server s) {
        super(t, w, g, s);
        damage = new int[] { 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8,
                9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15 };
    }

}
