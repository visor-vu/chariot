package edu.vanderbilt.isis.chariot.datamodel.NodeCategory;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import edu.vanderbilt.isis.chariot.datamodel.MemoryUnit;
import org.xtext.mongobeans.lib.IMongoBean;

@SuppressWarnings("all")
public class DM_AvailableMemory implements IMongoBean {
  /**
   * Creates a new DM_AvailableMemory wrapping the given {@link com.mongodb.DBObject}.
   */
  public DM_AvailableMemory(final DBObject dbObject) {
    this._dbObject = dbObject;
  }
  
  /**
   * Creates a new DM_AvailableMemory wrapping a new {@link com.mongodb.BasicDBObject}.
   */
  public DM_AvailableMemory() {
    _dbObject = new BasicDBObject();
    _dbObject.put(JAVA_CLASS_KEY, "edu.vanderbilt.isis.chariot.datamodel.NodeCategory.DM_AvailableMemory");
  }
  
  private DBObject _dbObject;
  
  public DBObject getDbObject() {
    return this._dbObject;
  }
  
  public int getMemory() {
    return (Integer) _dbObject.get("memory");
  }
  
  public void setMemory(final int memory) {
    _dbObject.put("memory", memory);
  }
  
  public String getUnit() {
    return (String) _dbObject.get("unit");
  }
  
  public void setUnit(final String unit) {
    _dbObject.put("unit", unit);
  }
  
  public void setUnit(final MemoryUnit unit) {
    String _string = unit.toString();
    this.setUnit(_string);
  }
}
