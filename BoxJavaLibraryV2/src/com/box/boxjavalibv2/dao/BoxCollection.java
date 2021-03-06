package com.box.boxjavalibv2.dao;

import java.util.ArrayList;
import java.util.Map;

import com.box.boxjavalibv2.interfaces.IBoxParcelWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BoxCollection extends BoxObject {

    public static final String FIELD_ENTRIES = "entries";
    public static final String FIELD_TOTAL_COUNT = "total_count";

    public BoxCollection() {
    }

    /**
     * Copy constructor, this does deep copy for all the fields.
     * 
     * @param obj
     */
    public BoxCollection(BoxCollection obj) {
        super(obj);
    }

    /**
     * Instantiate the object from a map. Each entry in the map reflects to a field.
     * 
     * @param map
     */
    public BoxCollection(Map<String, Object> map) {
        super(map);
    }

    /**
     * @return the entries
     */
    @SuppressWarnings("unchecked")
    @JsonProperty("entries")
    public ArrayList<BoxTypedObject> getEntries() {
        return (ArrayList<BoxTypedObject>) super.getValue(FIELD_ENTRIES);
    }

    /**
     * @param entries
     *            the entries to set
     */
    @JsonProperty("entries")
    private void setEntries(ArrayList<BoxTypedObject> entries) {
        put(FIELD_ENTRIES, entries);
    }

    /**
     * @return the total_count
     */
    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return (Integer) getValue(FIELD_TOTAL_COUNT);
    }

    /**
     * @param totalCount
     *            the total_count to set
     */
    @JsonProperty("total_count")
    private void setTotalCount(Integer totalCount) {
        put(FIELD_TOTAL_COUNT, totalCount);
    }

    public BoxCollection(IBoxParcelWrapper in) {
        super(in);
    }
}
