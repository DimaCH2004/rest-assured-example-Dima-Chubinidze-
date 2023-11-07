package com.koroyan.restassuredexample.pojos.request;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({GetListWithName.class})
@XmlType(namespace = "http://tempuri.org")
public class Body {

    @XmlAnyElement(lax = true)
    private Object object;

    public Body(Object object) {
        this.object = object;
    }

}
