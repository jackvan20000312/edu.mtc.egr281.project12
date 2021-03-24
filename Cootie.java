package project12;

public class Cootie {
	private boolean body, head, eyes, antennae, mouth;
	private int legs;
	private String name;
	
	public Cootie(String newName) {
		this.setName(newName) ;
	}// Ending bracket of constructor
	
	public String getName() {
		return this.name;
	}// Ending bracket of method getName
	
	private void setName(String newName) {
		this.name = newName;
	}// Ending bracket of method setName

	// A new body has no parts.
	public Cootie()
	{
		body = false;
		eyes = false;
		head = false;
		legs = 0;
		mouth = false;
	}//ending bracket for cootie
	
	// Add Cootie parts.
	//Add a body
	//All the below (addXxxx) have some safety measure built in
	public void addBody()
	{
		if(!body) {
			body = true;
		}
	}//ending bracket for addBody
	
	public void addHead() {
		if(body && !head) {
			head = true;
		}
	}//ending bracket for addHead
	
	public void addAntennae() {
		if(head && !antennae) {
			antennae=true;
		}
	}//ending bracket for addAntennae
	
	public void addEyes() {
		if(head && !eyes) {
			eyes=true;
		} 
	}//ending bracket for addEyes
	
	public boolean hasAddedALeg() {
		if(head && (legs < 6)) {
			legs++;
			return true;
		} else {
			return false;
		}
	}//ending bracket for addLegs
	
	public void addMouth() {
		if(head && !mouth) {
			mouth = true;
		} 
	}//ending bracket for addMouth
	
	// Return true if this Cootie has all of its parts
	public boolean isComplete() {
		if(body && eyes && antennae && head && (legs == 6) && mouth) {
			return true;
		}else {
			return false;
		}
	}//ending bracket for isComplete
	public boolean hasBody()
	{
		if(!body) {
			return false;
		} else {
			return true;
		}
	}//ending bracket for hasBody
	
	public boolean hasHead() {
		if(!head) {
			return false;
		} else {
			return true;
		}
	}//ending bracket for hasHead
	
	public boolean hasAntennae() {
		if(!antennae) {
			return false;
		} else {
			return true;
		}
	}//ending bracket for hasAntennae
	
	public boolean hasEyes() {
		if(!eyes) {
			return false;
		} else {
			return true;
		}
	}//ending bracket for hasEyes
	
	public boolean hasSixLegs() {
		if(legs < 6) {
			return false;
		} else {
			return true;
		}
	}//ending bracket for hasSixLegs
	
	public boolean hasMouth() {
		if(!mouth) {
			return false;
		} else {
			return true;
		}
	}//ending bracket for hasMouth
	
	public String toString(Cootie bug) {
		if(body) {
			String result = "";
			result += bug.getName() + " has A Body,"; 
			
			if(head) {
				result += " A Head,";
				if(eyes) {
					result += " A set of eyes,"; 
				}if(mouth) {
					result += " A Mouth,";
				}if(antennae) {
					result += " A Antennae,";
				}if(legs == 1) {
					result += " and 1 leg.";
				}if(legs == 2) {
					result += " and 2 legs.";
				}if(legs == 3) {
					result += " and 3 legs.";
				}if(legs == 4) {
					result += " and 4 legs.";
				}if(legs == 5) {
					result += " and 5 legs.";
				}if(legs == 6) {
					result += "and 6 legs.";
				}//3rd level if ending bracket
			}//2nd level if ending bracket
			return result;
		}else {
			return "No parts yet.";
		}//1st level ending bracket of else
	}//ending bracket for toString()
}//ending bracket for Cootie
