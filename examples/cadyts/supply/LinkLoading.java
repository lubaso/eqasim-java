/*
 * Cadyts - Calibration of dynamic traffic simulations
 *
 * Copyright 2009, 2010 Gunnar Fl�tter�d
 * 
 *
 * This file is part of Cadyts.
 *
 * Cadyts is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Cadyts is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cadyts.  If not, see <http://www.gnu.org/licenses/>.
 *
 * contact: gunnar.floetteroed@epfl.ch
 *
 */ 
package cadyts.supply;

import java.io.Serializable;
import java.util.Set;

import cadyts.demand.Demand;
import cadyts.demand.Plan;

/**
 * 
 * @author Gunnar Fl�tter�d
 * 
 * @param <L> the link type
 */
public interface LinkLoading<L> extends Serializable {

	public int getStartTime_s();

	public int getEndTime_s();

	public L getLink();

	public Set<L> getRelevantLinks();

	public double getRegressionInertia();

	public void freeze();

	public void update(Demand<L> demand, double linkFeature);

	public double predictLinkFeature(Demand<L> demand);

	public boolean isPlanListening();

	public void notifyPlanChoice(Plan<L> plan);

	public double get_dLinkFeature_dDemand(L link);

}