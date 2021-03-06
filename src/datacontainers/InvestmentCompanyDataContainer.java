/*
 *  This Class contains several containers which can hold classroom objects 
 *  created in the UI
 */
package datacontainers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import datamodels.InvestmentCompany;

@XmlRootElement(name = "companyList")
@XmlAccessorType(XmlAccessType.FIELD)
public class InvestmentCompanyDataContainer  {

    /** Simple container that stores elements as a list, can contain duplicates 
     *  Stores in FIFO order
     */
	 @XmlElement(name = "company") 
    private List<InvestmentCompany> companyList = new ArrayList<>();
    
    /** Container that stores elements as a set of unique elements
     *  Random ordering
     */
    private Set<?> companySet = new HashSet<Object>();

    /** Container that stores elements as a map, can contain duplicates
     *  Order not enforced
     */
    private Map<Object, Object> companyMap = new HashMap<Object, Object>();

    
    
    public List<InvestmentCompany> getcompanyList() {
        return companyList;
    }

    public void setcompanyList(List<InvestmentCompany> companyList) {
        this.companyList = companyList;
    }

    public Set<?> getcompanySet() {
        return companySet;
    }

    public void setStockQuoteSet(Set<?> companySet) {
        this.companySet = companySet;
    }

    public Map<Object, Object> getcompanyMap() {
        return companyMap;
    }

    public void setcompanyMap(Map<Object, Object> companyMap) {
        this.companyMap = companyMap;
    }


}