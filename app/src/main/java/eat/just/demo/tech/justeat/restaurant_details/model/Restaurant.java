package eat.just.demo.tech.justeat.restaurant_details.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Badges",
        "Score",
        "DriveDistance",
        "DriveInfoCalculated",
        "NewnessDate",
        "DeliveryMenuId",
        "DeliveryOpeningTime",
        "DeliveryCost",
        "MinimumDeliveryValue",
        "DeliveryTimeMinutes",
        "DeliveryWorkingTimeMinutes",
        "OpeningTime",
        "OpeningTimeIso",
        "SendsOnItsWayNotifications",
        "RatingAverage",
        "Latitude",
        "Longitude",
        "Tags",
        "Id",
        "Name",
        "Address",
        "Postcode",
        "City",
        "CuisineTypes",
        "Url",
        "IsOpenNow",
        "IsPremier",
        "IsSponsored",
        "SponsoredPosition",
        "IsNew",
        "IsTemporarilyOffline",
        "ReasonWhyTemporarilyOffline",
        "UniqueName",
        "IsCloseBy",
        "IsHalal",
        "IsTestRestaurant",
        "DefaultDisplayRank",
        "IsOpenNowForDelivery",
        "IsOpenNowForCollection",
        "RatingStars",
        "Logo",
        "Deals",
        "NumberOfRatings"
})
public class Restaurant {

    @JsonProperty("Badges")
    private List<Object> badges = null;
    @JsonProperty("Score")
    private Double score;
    @JsonProperty("DriveDistance")
    private Integer driveDistance;
    @JsonProperty("DriveInfoCalculated")
    private Boolean driveInfoCalculated;
    @JsonProperty("NewnessDate")
    private String newnessDate;
    @JsonProperty("DeliveryMenuId")
    private Integer deliveryMenuId;
    @JsonProperty("DeliveryOpeningTime")
    private String deliveryOpeningTime;
    @JsonProperty("DeliveryCost")
    private Integer deliveryCost;
    @JsonProperty("MinimumDeliveryValue")
    private Integer minimumDeliveryValue;
    @JsonProperty("DeliveryTimeMinutes")
    private Object deliveryTimeMinutes;
    @JsonProperty("DeliveryWorkingTimeMinutes")
    private Integer deliveryWorkingTimeMinutes;
    @JsonProperty("OpeningTime")
    private String openingTime;
    @JsonProperty("OpeningTimeIso")
    private String openingTimeIso;
    @JsonProperty("SendsOnItsWayNotifications")
    private Boolean sendsOnItsWayNotifications;
    @JsonProperty("RatingAverage")
    private Double ratingAverage;
    @JsonProperty("Latitude")
    private Double latitude;
    @JsonProperty("Longitude")
    private Double longitude;
    @JsonProperty("Tags")
    private List<String> tags = null;
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("Postcode")
    private String postcode;
    @JsonProperty("City")
    private String city;
    @JsonProperty("CuisineTypes")
    private List<CuisineType> cuisineTypes = null;
    @JsonProperty("Url")
    private String url;
    @JsonProperty("IsOpenNow")
    private Boolean isOpenNow;
    @JsonProperty("IsPremier")
    private Boolean isPremier;
    @JsonProperty("IsSponsored")
    private Boolean isSponsored;
    @JsonProperty("SponsoredPosition")
    private Integer sponsoredPosition;
    @JsonProperty("IsNew")
    private Boolean isNew;
    @JsonProperty("IsTemporarilyOffline")
    private Boolean isTemporarilyOffline;
    @JsonProperty("ReasonWhyTemporarilyOffline")
    private String reasonWhyTemporarilyOffline;
    @JsonProperty("UniqueName")
    private String uniqueName;
    @JsonProperty("IsCloseBy")
    private Boolean isCloseBy;
    @JsonProperty("IsHalal")
    private Boolean isHalal;
    @JsonProperty("IsTestRestaurant")
    private Boolean isTestRestaurant;
    @JsonProperty("DefaultDisplayRank")
    private Integer defaultDisplayRank;
    @JsonProperty("IsOpenNowForDelivery")
    private Boolean isOpenNowForDelivery;
    @JsonProperty("IsOpenNowForCollection")
    private Boolean isOpenNowForCollection;
    @JsonProperty("RatingStars")
    private Integer ratingStars;
    @JsonProperty("Logo")
    private List<Logo> logo = null;
    @JsonProperty("Deals")
    private List<Object> deals = null;
    @JsonProperty("NumberOfRatings")
    private Integer numberOfRatings;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Badges")
    public List<Object> getBadges() {
        return badges;
    }

    @JsonProperty("Badges")
    public void setBadges(List<Object> badges) {
        this.badges = badges;
    }

    @JsonProperty("Score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("Score")
    public void setScore(Double score) {
        this.score = score;
    }

    @JsonProperty("DriveDistance")
    public Integer getDriveDistance() {
        return driveDistance;
    }

    @JsonProperty("DriveDistance")
    public void setDriveDistance(Integer driveDistance) {
        this.driveDistance = driveDistance;
    }

    @JsonProperty("DriveInfoCalculated")
    public Boolean getDriveInfoCalculated() {
        return driveInfoCalculated;
    }

    @JsonProperty("DriveInfoCalculated")
    public void setDriveInfoCalculated(Boolean driveInfoCalculated) {
        this.driveInfoCalculated = driveInfoCalculated;
    }

    @JsonProperty("NewnessDate")
    public String getNewnessDate() {
        return newnessDate;
    }

    @JsonProperty("NewnessDate")
    public void setNewnessDate(String newnessDate) {
        this.newnessDate = newnessDate;
    }

    @JsonProperty("DeliveryMenuId")
    public Integer getDeliveryMenuId() {
        return deliveryMenuId;
    }

    @JsonProperty("DeliveryMenuId")
    public void setDeliveryMenuId(Integer deliveryMenuId) {
        this.deliveryMenuId = deliveryMenuId;
    }

    @JsonProperty("DeliveryOpeningTime")
    public String getDeliveryOpeningTime() {
        return deliveryOpeningTime;
    }

    @JsonProperty("DeliveryOpeningTime")
    public void setDeliveryOpeningTime(String deliveryOpeningTime) {
        this.deliveryOpeningTime = deliveryOpeningTime;
    }

    @JsonProperty("DeliveryCost")
    public Integer getDeliveryCost() {
        return deliveryCost;
    }

    @JsonProperty("DeliveryCost")
    public void setDeliveryCost(Integer deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    @JsonProperty("MinimumDeliveryValue")
    public Integer getMinimumDeliveryValue() {
        return minimumDeliveryValue;
    }

    @JsonProperty("MinimumDeliveryValue")
    public void setMinimumDeliveryValue(Integer minimumDeliveryValue) {
        this.minimumDeliveryValue = minimumDeliveryValue;
    }

    @JsonProperty("DeliveryTimeMinutes")
    public Object getDeliveryTimeMinutes() {
        return deliveryTimeMinutes;
    }

    @JsonProperty("DeliveryTimeMinutes")
    public void setDeliveryTimeMinutes(Object deliveryTimeMinutes) {
        this.deliveryTimeMinutes = deliveryTimeMinutes;
    }

    @JsonProperty("DeliveryWorkingTimeMinutes")
    public Integer getDeliveryWorkingTimeMinutes() {
        return deliveryWorkingTimeMinutes;
    }

    @JsonProperty("DeliveryWorkingTimeMinutes")
    public void setDeliveryWorkingTimeMinutes(Integer deliveryWorkingTimeMinutes) {
        this.deliveryWorkingTimeMinutes = deliveryWorkingTimeMinutes;
    }

    @JsonProperty("OpeningTime")
    public String getOpeningTime() {
        return openingTime;
    }

    @JsonProperty("OpeningTime")
    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    @JsonProperty("OpeningTimeIso")
    public String getOpeningTimeIso() {
        return openingTimeIso;
    }

    @JsonProperty("OpeningTimeIso")
    public void setOpeningTimeIso(String openingTimeIso) {
        this.openingTimeIso = openingTimeIso;
    }

    @JsonProperty("SendsOnItsWayNotifications")
    public Boolean getSendsOnItsWayNotifications() {
        return sendsOnItsWayNotifications;
    }

    @JsonProperty("SendsOnItsWayNotifications")
    public void setSendsOnItsWayNotifications(Boolean sendsOnItsWayNotifications) {
        this.sendsOnItsWayNotifications = sendsOnItsWayNotifications;
    }

    @JsonProperty("RatingAverage")
    public Double getRatingAverage() {
        return ratingAverage;
    }

    @JsonProperty("RatingAverage")
    public void setRatingAverage(Double ratingAverage) {
        this.ratingAverage = ratingAverage;
    }

    @JsonProperty("Latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("Latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("Longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("Longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("Tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("Tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("Postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("Postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("CuisineTypes")
    public List<CuisineType> getCuisineTypes() {
        return cuisineTypes;
    }

    @JsonProperty("CuisineTypes")
    public void setCuisineTypes(List<CuisineType> cuisineTypes) {
        this.cuisineTypes = cuisineTypes;
    }

    @JsonProperty("Url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("Url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("IsOpenNow")
    public Boolean getIsOpenNow() {
        return isOpenNow;
    }

    @JsonProperty("IsOpenNow")
    public void setIsOpenNow(Boolean isOpenNow) {
        this.isOpenNow = isOpenNow;
    }

    @JsonProperty("IsPremier")
    public Boolean getIsPremier() {
        return isPremier;
    }

    @JsonProperty("IsPremier")
    public void setIsPremier(Boolean isPremier) {
        this.isPremier = isPremier;
    }

    @JsonProperty("IsSponsored")
    public Boolean getIsSponsored() {
        return isSponsored;
    }

    @JsonProperty("IsSponsored")
    public void setIsSponsored(Boolean isSponsored) {
        this.isSponsored = isSponsored;
    }

    @JsonProperty("SponsoredPosition")
    public Integer getSponsoredPosition() {
        return sponsoredPosition;
    }

    @JsonProperty("SponsoredPosition")
    public void setSponsoredPosition(Integer sponsoredPosition) {
        this.sponsoredPosition = sponsoredPosition;
    }

    @JsonProperty("IsNew")
    public Boolean getIsNew() {
        return isNew;
    }

    @JsonProperty("IsNew")
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    @JsonProperty("IsTemporarilyOffline")
    public Boolean getIsTemporarilyOffline() {
        return isTemporarilyOffline;
    }

    @JsonProperty("IsTemporarilyOffline")
    public void setIsTemporarilyOffline(Boolean isTemporarilyOffline) {
        this.isTemporarilyOffline = isTemporarilyOffline;
    }

    @JsonProperty("ReasonWhyTemporarilyOffline")
    public String getReasonWhyTemporarilyOffline() {
        return reasonWhyTemporarilyOffline;
    }

    @JsonProperty("ReasonWhyTemporarilyOffline")
    public void setReasonWhyTemporarilyOffline(String reasonWhyTemporarilyOffline) {
        this.reasonWhyTemporarilyOffline = reasonWhyTemporarilyOffline;
    }

    @JsonProperty("UniqueName")
    public String getUniqueName() {
        return uniqueName;
    }

    @JsonProperty("UniqueName")
    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    @JsonProperty("IsCloseBy")
    public Boolean getIsCloseBy() {
        return isCloseBy;
    }

    @JsonProperty("IsCloseBy")
    public void setIsCloseBy(Boolean isCloseBy) {
        this.isCloseBy = isCloseBy;
    }

    @JsonProperty("IsHalal")
    public Boolean getIsHalal() {
        return isHalal;
    }

    @JsonProperty("IsHalal")
    public void setIsHalal(Boolean isHalal) {
        this.isHalal = isHalal;
    }

    @JsonProperty("IsTestRestaurant")
    public Boolean getIsTestRestaurant() {
        return isTestRestaurant;
    }

    @JsonProperty("IsTestRestaurant")
    public void setIsTestRestaurant(Boolean isTestRestaurant) {
        this.isTestRestaurant = isTestRestaurant;
    }

    @JsonProperty("DefaultDisplayRank")
    public Integer getDefaultDisplayRank() {
        return defaultDisplayRank;
    }

    @JsonProperty("DefaultDisplayRank")
    public void setDefaultDisplayRank(Integer defaultDisplayRank) {
        this.defaultDisplayRank = defaultDisplayRank;
    }

    @JsonProperty("IsOpenNowForDelivery")
    public Boolean getIsOpenNowForDelivery() {
        return isOpenNowForDelivery;
    }

    @JsonProperty("IsOpenNowForDelivery")
    public void setIsOpenNowForDelivery(Boolean isOpenNowForDelivery) {
        this.isOpenNowForDelivery = isOpenNowForDelivery;
    }

    @JsonProperty("IsOpenNowForCollection")
    public Boolean getIsOpenNowForCollection() {
        return isOpenNowForCollection;
    }

    @JsonProperty("IsOpenNowForCollection")
    public void setIsOpenNowForCollection(Boolean isOpenNowForCollection) {
        this.isOpenNowForCollection = isOpenNowForCollection;
    }

    @JsonProperty("RatingStars")
    public Integer getRatingStars() {
        return ratingStars;
    }

    @JsonProperty("RatingStars")
    public void setRatingStars(Integer ratingStars) {
        this.ratingStars = ratingStars;
    }

    @JsonProperty("Logo")
    public List<Logo> getLogo() {
        return logo;
    }

    @JsonProperty("Logo")
    public void setLogo(List<Logo> logo) {
        this.logo = logo;
    }

    @JsonProperty("Deals")
    public List<Object> getDeals() {
        return deals;
    }

    @JsonProperty("Deals")
    public void setDeals(List<Object> deals) {
        this.deals = deals;
    }

    @JsonProperty("NumberOfRatings")
    public Integer getNumberOfRatings() {
        return numberOfRatings;
    }

    @JsonProperty("NumberOfRatings")
    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}