/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, Red Hat, Inc. and/or its affiliates or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat, Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.jpamodelgen.test.accesstype;

import java.util.Set;
import javax.persistence.Embeddable;
import javax.persistence.Access;
import javax.persistence.ElementCollection;
import javax.persistence.CollectionTable;

/**
 * @author Emmanuel Bernard
 */
@Embeddable
@Access(javax.persistence.AccessType.PROPERTY)
public class Address {
	private String street1;
	private String city;
	private Country country;
	private Set<Inhabitant> inhabitants;

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@ElementCollection
	@CollectionTable(name = "Add_Inh")
	public Set<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	public void setInhabitants(Set<Inhabitant> inhabitants) {
		this.inhabitants = inhabitants;
	}
}
