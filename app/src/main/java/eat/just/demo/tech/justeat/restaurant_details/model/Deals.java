package eat.just.demo.tech.justeat.restaurant_details.model;

public class Deals
{
    private String DiscountPercent;

    private String Description;

    private String QualifyingPrice;

    public String getDiscountPercent ()
    {
        return DiscountPercent;
    }

    public void setDiscountPercent (String DiscountPercent)
    {
        this.DiscountPercent = DiscountPercent;
    }

    public String getDescription ()
    {
        return Description;
    }

    public void setDescription (String Description)
    {
        this.Description = Description;
    }

    public String getQualifyingPrice ()
    {
        return QualifyingPrice;
    }

    public void setQualifyingPrice (String QualifyingPrice)
    {
        this.QualifyingPrice = QualifyingPrice;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DiscountPercent = "+DiscountPercent+", Description = "+Description+", QualifyingPrice = "+QualifyingPrice+"]";
    }
}
