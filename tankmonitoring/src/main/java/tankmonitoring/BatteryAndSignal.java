package tankmonitoring;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BatteryAndSignal implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String tankType;
   private java.lang.String fieldType;
   private java.lang.Double reading;
   private java.lang.String alert;
   private java.lang.String status;
   private java.lang.String color;
   private java.lang.String notificationMethod;

   public BatteryAndSignal()
   {
   }

   public java.lang.String getTankType()
   {
      return this.tankType;
   }

   public void setTankType(java.lang.String tankType)
   {
      this.tankType = tankType;
   }

   public java.lang.String getFieldType()
   {
      return this.fieldType;
   }

   public void setFieldType(java.lang.String fieldType)
   {
      this.fieldType = fieldType;
   }

   public java.lang.Double getReading()
   {
      return this.reading;
   }

   public void setReading(java.lang.Double reading)
   {
      this.reading = reading;
   }

   public java.lang.String getAlert()
   {
      return this.alert;
   }

   public void setAlert(java.lang.String alert)
   {
      this.alert = alert;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.String getColor()
   {
      return this.color;
   }

   public void setColor(java.lang.String color)
   {
      this.color = color;
   }

   public java.lang.String getNotificationMethod()
   {
      return this.notificationMethod;
   }

   public void setNotificationMethod(java.lang.String notificationMethod)
   {
      this.notificationMethod = notificationMethod;
   }

   public BatteryAndSignal(java.lang.String tankType,
         java.lang.String fieldType, java.lang.Double reading,
         java.lang.String alert, java.lang.String status,
         java.lang.String color, java.lang.String notificationMethod)
   {
      this.tankType = tankType;
      this.fieldType = fieldType;
      this.reading = reading;
      this.alert = alert;
      this.status = status;
      this.color = color;
      this.notificationMethod = notificationMethod;
   }

}