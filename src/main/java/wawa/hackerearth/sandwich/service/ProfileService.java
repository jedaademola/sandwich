package wawa.hackerearth.sandwich.service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;


import wawa.hackerearth.sandwich.dao.OrderRepository;
import wawa.hackerearth.sandwich.model.entity.OrderItems;
import wawa.hackerearth.sandwich.model.vo.data.SandWishData;

@Service
public class ProfileService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProfileService.class);
	 @Autowired
	 private OrderRepository orderRepository;
	 
	 public OrderItems placeOrder(OrderItems orderItems) {
		 
		 return orderRepository.save(orderItems);
	 }
	 
	public SandWishData sandWishData() {
		ObjectMapper mapper = new ObjectMapper();
		SandWishData sandWishData = null;
		String jsonInString = "{\n" + 
				"  \"id\": \"85789105-d35c-4b53-a77a-e712de28cb0c\",\n" + 
				"  \"name\": \"Cajun Turkey\",\n" + 
				"  \"unitprice\": {\n" + 
				"    \"amount\": 3.59,\n" + 
				"    \"currencyCode\": \"USD\",\n" + 
				"    \"display\": \"$3.59\"\n" + 
				"  },\n" + 
				"  \"img\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Your+Cajun+Turkey-jqGZN1qi.PNG\",\n" + 
				"  \"quantity\": 1,\n" + 
				"  \"calculativeprice\": {\n" + 
				"    \"amount\": 3.59,\n" + 
				"    \"currencyCode\": \"USD\",\n" + 
				"    \"display\": \"$3.59\"\n" + 
				"  },\n" + 
				"  \"optionSetsArray\": [\n" + 
				"    {\n" + 
				"      \"optionSetName\": \"Select Your Bread\",\n" + 
				"      \"optionsArray\": [\n" + 
				"        {\n" + 
				"          \"id\": \"7cf90663-f096-40ec-aac9-449b4851362b\",\n" + 
				"          \"name\": \"White Roll\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 30,\n" + 
				"            \"calculatedCalValue\": 30\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Wheat+Classic+Roll-77lfXKl3.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [\n" + 
				"            {\n" + 
				"              \"id\": \"a982bb05-0a69-4fd7-b0c5-0c06a7867c65\",\n" + 
				"              \"name\": \"Not Toasted\",\n" + 
				"              \"unitprice\": \"\",\n" + 
				"              \"isMandatory\": \"\",\n" + 
				"              \"isSelected\": \"\",\n" + 
				"              \"OptionsItemPricing\": {\n" + 
				"                \"amount\": 0,\n" + 
				"                \"currencyCode\": \"USD\",\n" + 
				"                \"display\": \"$0\"\n" + 
				"              },\n" + 
				"              \"calorieObj\": \"\",\n" + 
				"              \"imageUrl\": \"\",\n" + 
				"              \"optionAddToCartUrl\": \"\",\n" + 
				"              \"choiceItemsArray\": [],\n" + 
				"              \"variantId\": 1\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"a982bb05-0a69-4fd7-b0c5-0c06a7867c65\",\n" + 
				"              \"name\": \"Toast Roll\",\n" + 
				"              \"unitprice\": \"\",\n" + 
				"              \"isMandatory\": \"\",\n" + 
				"              \"isSelected\": \"\",\n" + 
				"              \"OptionsItemPricing\": {\n" + 
				"                \"amount\": 0,\n" + 
				"                \"currencyCode\": \"USD\",\n" + 
				"                \"display\": \"$0\"\n" + 
				"              },\n" + 
				"              \"calorieObj\": \"\",\n" + 
				"              \"imageUrl\": \"\",\n" + 
				"              \"optionAddToCartUrl\": \"\",\n" + 
				"              \"choiceItemsArray\": [],\n" + 
				"              \"variantId\": 2\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"a982bb05-0a69-4fd7-b0c5-0c06a7867c65\",\n" + 
				"              \"name\": \"Toast Sandwich\",\n" + 
				"              \"unitprice\": \"\",\n" + 
				"              \"isMandatory\": \"\",\n" + 
				"              \"isSelected\": \"\",\n" + 
				"              \"OptionsItemPricing\": {\n" + 
				"                \"amount\": 0,\n" + 
				"                \"currencyCode\": \"USD\",\n" + 
				"                \"display\": \"$0\"\n" + 
				"              },\n" + 
				"              \"calorieObj\": \"\",\n" + 
				"              \"imageUrl\": \"\",\n" + 
				"              \"optionAddToCartUrl\": \"\",\n" + 
				"              \"choiceItemsArray\": [],\n" + 
				"              \"variantId\": 3\n" + 
				"            }\n" + 
				"          ],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"7a532b09-76a9-4b43-b80c-20c3aa23eba0\",\n" + 
				"          \"name\": \"Wheat Roll\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 30,\n" + 
				"            \"calculatedCalValue\": 30\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Wheat+Classic+Roll-HLVkI77Q.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [\n" + 
				"            {\n" + 
				"              \"id\": \"a982bb05-0a69-4fd7-b0c5-0c06a7867c65\",\n" + 
				"              \"name\": \"Not Toasted\",\n" + 
				"              \"unitprice\": \"\",\n" + 
				"              \"isMandatory\": \"\",\n" + 
				"              \"isSelected\": \"\",\n" + 
				"              \"OptionsItemPricing\": {\n" + 
				"                \"amount\": 0,\n" + 
				"                \"currencyCode\": \"USD\",\n" + 
				"                \"display\": \"$0\"\n" + 
				"              },\n" + 
				"              \"calorieObj\": \"\",\n" + 
				"              \"imageUrl\": \"\",\n" + 
				"              \"optionAddToCartUrl\": \"\",\n" + 
				"              \"choiceItemsArray\": [],\n" + 
				"              \"variantId\": 1\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"a982bb05-0a69-4fd7-b0c5-0c06a7867c65\",\n" + 
				"              \"name\": \"Toast Roll\",\n" + 
				"              \"unitprice\": \"\",\n" + 
				"              \"isMandatory\": \"\",\n" + 
				"              \"isSelected\": \"\",\n" + 
				"              \"OptionsItemPricing\": {\n" + 
				"                \"amount\": 0,\n" + 
				"                \"currencyCode\": \"USD\",\n" + 
				"                \"display\": \"$0\"\n" + 
				"              },\n" + 
				"              \"calorieObj\": \"\",\n" + 
				"              \"imageUrl\": \"\",\n" + 
				"              \"optionAddToCartUrl\": \"\",\n" + 
				"              \"choiceItemsArray\": [],\n" + 
				"              \"variantId\": 2\n" + 
				"            },\n" + 
				"            {\n" + 
				"              \"id\": \"a982bb05-0a69-4fd7-b0c5-0c06a7867c65\",\n" + 
				"              \"name\": \"Toast Sandwich\",\n" + 
				"              \"unitprice\": \"\",\n" + 
				"              \"isMandatory\": \"\",\n" + 
				"              \"isSelected\": \"\",\n" + 
				"              \"OptionsItemPricing\": {\n" + 
				"                \"amount\": 0,\n" + 
				"                \"currencyCode\": \"USD\",\n" + 
				"                \"display\": \"$0\"\n" + 
				"              },\n" + 
				"              \"calorieObj\": \"\",\n" + 
				"              \"imageUrl\": \"\",\n" + 
				"              \"optionAddToCartUrl\": \"\",\n" + 
				"              \"choiceItemsArray\": [],\n" + 
				"              \"variantId\": 3\n" + 
				"            }\n" + 
				"          ],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"minAllowed\": 1,\n" + 
				"      \"maxAllowed\": 1,\n" + 
				"      \"hasCalorieMultiplier\": false,\n" + 
				"      \"id\": \"select-your-bread-junior-classic\",\n" + 
				"      \"extraOptionsArray\": [],\n" + 
				"      \"isSorted\": false,\n" + 
				"      \"isAddOn\": false\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"optionSetName\": \"Select a Variety\",\n" + 
				"      \"optionsArray\": [\n" + 
				"        {\n" + 
				"          \"id\": \"575ecc1e-98ca-4fe3-a423-8b7ab6bf8ab7\",\n" + 
				"          \"name\": \"Oven Roasted Turkey\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": true,\n" + 
				"          \"isSelected\": true,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 220,\n" + 
				"            \"calculatedCalValue\": 220\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Oven+Roasted+Turkey-vdtV_Ubq.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"minAllowed\": 1,\n" + 
				"      \"maxAllowed\": 1,\n" + 
				"      \"hasCalorieMultiplier\": false,\n" + 
				"      \"id\": \"select-a-cajun-turkey-variety\",\n" + 
				"      \"extraOptionsArray\": [\n" + 
				"        {\n" + 
				"          \"id\": \"8d353289-67df-4b88-9611-c1be68f8c0ab\",\n" + 
				"          \"name\": \"Extra Meat\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0.8,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0.8\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 150,\n" + 
				"            \"calculatedCalValue\": 150\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Extra+Meat-tBcf7SQ3.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"isSorted\": false,\n" + 
				"      \"isAddOn\": true\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"optionSetName\": \"Select Your Cheese\",\n" + 
				"      \"optionsArray\": [\n" + 
				"        {\n" + 
				"          \"id\": \"25072123-ee22-4567-bfdb-8fc7728b8afa\",\n" + 
				"          \"name\": \"Pepper Jack\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": true,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 160,\n" + 
				"            \"calculatedCalValue\": 160\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Pepper+Jack-SuPhiPTq.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"e53b7714-7b9b-4664-b4fd-bf0825b7830c\",\n" + 
				"          \"name\": \"Cheddar\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 200,\n" + 
				"            \"calculatedCalValue\": 200\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Cheddar-vH8iYIAM.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"e8ad7283-cc65-4e78-9db2-212fcabee768\",\n" + 
				"          \"name\": \"American\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 180,\n" + 
				"            \"calculatedCalValue\": 180\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/American-8rHtpLP6.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"e8451f20-8c98-45e9-b4c5-58945384d004\",\n" + 
				"          \"name\": \"Yellow American\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 200,\n" + 
				"            \"calculatedCalValue\": 200\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Yellow+American-RFzo9Kkt.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"8d058d10-f6b6-44ca-bf62-5bc64fa177cb\",\n" + 
				"          \"name\": \"Swiss\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 200,\n" + 
				"            \"calculatedCalValue\": 200\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Swiss-2wrFIlve.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"106b7af9-d677-4162-b368-ab570209a350\",\n" + 
				"          \"name\": \"Provolone\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 190,\n" + 
				"            \"calculatedCalValue\": 190\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Provolone-wbdkV2LA.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"minAllowed\": 0,\n" + 
				"      \"maxAllowed\": 1,\n" + 
				"      \"hasCalorieMultiplier\": false,\n" + 
				"      \"id\": \"select-your-cheese-cajun-turkey\",\n" + 
				"      \"extraOptionsArray\": [\n" + 
				"        {\n" + 
				"          \"id\": \"8e7e77b2-dd74-4e32-be56-9186f52a7320\",\n" + 
				"          \"name\": \"Extra Cheese\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0.25,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0.25\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 150,\n" + 
				"            \"calculatedCalValue\": 150\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Extra+Cheese-iUITCoNI.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"isSorted\": false,\n" + 
				"      \"isAddOn\": false\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"optionSetName\": \"Select Your Spread\",\n" + 
				"      \"optionsArray\": [\n" + 
				"        {\n" + 
				"          \"id\": \"84e78505-b14a-41f8-b5f3-855a507c64bf\",\n" + 
				"          \"name\": \"Remoulade\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": true,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 40,\n" + 
				"            \"calculatedCalValue\": 40\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Creamy+Horseradish+S-FKykEQC4.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"d13ae52a-ca84-4ceb-a488-55cddcdd7c09\",\n" + 
				"          \"name\": \"Mayo\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 20,\n" + 
				"            \"calculatedCalValue\": 20\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Mayo-RsgkQrQI.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"a892b6be-a0ed-4149-837c-265008229a87\",\n" + 
				"          \"name\": \"Oil\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 60,\n" + 
				"            \"calculatedCalValue\": 60\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Oil-1N8vHoNs.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"b3169f6f-87bd-438c-9b0c-516c609dded7\",\n" + 
				"          \"name\": \"Vinegar\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 50,\n" + 
				"            \"calculatedCalValue\": 50\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Vinegar-PKT_zeQc.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"dfa0a4be-0fec-4ee6-87df-bfc8b14a397d\",\n" + 
				"          \"name\": \"Mustard\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 70,\n" + 
				"            \"calculatedCalValue\": 70\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Honey+Musard-TX5eXajq.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"4cae70e5-28af-464f-86c0-df89b437706c\",\n" + 
				"          \"name\": \"Spicy Mustard\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 0,\n" + 
				"            \"calculatedCalValue\": 0\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Spicy+Mustard-y32IJYf3.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"31e6ed7d-1b0a-44f4-ab0f-6de61782f819\",\n" + 
				"          \"name\": \"Buffalo\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 60,\n" + 
				"            \"calculatedCalValue\": 60\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Oil--3UDBM6i.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"ac458081-db90-4b2e-9589-81146838be7d\",\n" + 
				"          \"name\": \"Ketchup\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 50,\n" + 
				"            \"calculatedCalValue\": 50\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Ketchup-cK42gLiY.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"5ca75558-bd15-49de-b24b-27808b0e7883\",\n" + 
				"          \"name\": \"Ranch\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 0,\n" + 
				"            \"calculatedCalValue\": 0\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Ranch+Dressing-ipuLDcqY.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"9a0e83da-14f3-4682-8efa-c4a20476ae65\",\n" + 
				"          \"name\": \"BBQ\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 120,\n" + 
				"            \"calculatedCalValue\": 120\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/BBQ+Sauce-f6ctdp0M.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"21d62f82-af61-472c-a00f-2db855e481be\",\n" + 
				"          \"name\": \"Chipotle\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 110,\n" + 
				"            \"calculatedCalValue\": 110\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Creamy+Chipotle+Sauc-TCdJb9Lj.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"395e8b94-33b1-47e2-a415-74ce3ca9d607\",\n" + 
				"          \"name\": \"Garlic Aioli\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 110,\n" + 
				"            \"calculatedCalValue\": 110\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Creamy+Horseradish+S-boBiDesG.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"b6d863b1-a115-4bd8-afe1-a8635e95453e\",\n" + 
				"          \"name\": \"Cherry Pepper Relish\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 40,\n" + 
				"            \"calculatedCalValue\": 40\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/sweet+pepper-GLDozU-c.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"minAllowed\": 0,\n" + 
				"      \"maxAllowed\": 13,\n" + 
				"      \"hasCalorieMultiplier\": false,\n" + 
				"      \"id\": \"select-your-spread-cajun-turkey\",\n" + 
				"      \"extraOptionsArray\": [],\n" + 
				"      \"isSorted\": false,\n" + 
				"      \"isAddOn\": false\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"optionSetName\": \"Select Your Toppings\",\n" + 
				"      \"optionsArray\": [\n" + 
				"        {\n" + 
				"          \"id\": \"70f5016e-1c7b-468a-ba3e-1c8d73ab27d6\",\n" + 
				"          \"name\": \"Lettuce\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": true,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 3,\n" + 
				"            \"calculatedCalValue\": 3\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Lettuce-fCWS-n57.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"d09813fc-fe8c-4e46-b52e-f0f801c3c14b\",\n" + 
				"          \"name\": \"Pickles\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": true,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 10,\n" + 
				"            \"calculatedCalValue\": 10\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/pickles-_W-yuNgk.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"e8e5bf87-e97d-414e-9de9-5a7dd2189d52\",\n" + 
				"          \"name\": \"Tomatoes\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 5,\n" + 
				"            \"calculatedCalValue\": 5\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/tomato-TtHQOI4_.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"c2780ba0-59fb-4127-bb30-d7b18ee9a808\",\n" + 
				"          \"name\": \"Onions\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 0,\n" + 
				"            \"calculatedCalValue\": 0\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/onions-iXnpjMid.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"87067123-ebfd-4625-b8c9-b179fbde0077\",\n" + 
				"          \"name\": \"Spinach\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 2,\n" + 
				"            \"calculatedCalValue\": 2\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/spinach-XQFY4-JU.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"d0ba7478-cd51-40a7-90e1-6950a23376ab\",\n" + 
				"          \"name\": \"Hot Peppers\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 0,\n" + 
				"            \"calculatedCalValue\": 0\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/hot+peppers-rVGLyo6j.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"ef13579a-e5b7-4a19-9ec1-2ae86c009223\",\n" + 
				"          \"name\": \"Sweet Peppers\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 10,\n" + 
				"            \"calculatedCalValue\": 10\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/sweet+pepper-F3vTlt38.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"107c076d-f616-4e08-ae55-48bcf9729101\",\n" + 
				"          \"name\": \"Cucumbers\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 10,\n" + 
				"            \"calculatedCalValue\": 10\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/cucumber-G3DXl6D3.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"fa881725-8f75-4601-82d5-e9b0f6e75261\",\n" + 
				"          \"name\": \"Jalapeno Peppers\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 0,\n" + 
				"            \"calculatedCalValue\": 0\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Jalapeno+Peppers-3GoBDZuz.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"c0c5e69a-e324-45f9-bcb3-ee01d9f27133\",\n" + 
				"          \"name\": \"Roasted Red Peppers\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 35,\n" + 
				"            \"calculatedCalValue\": 35\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/roasted+peppers-fNO9ch1u.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"minAllowed\": 0,\n" + 
				"      \"maxAllowed\": 10,\n" + 
				"      \"hasCalorieMultiplier\": false,\n" + 
				"      \"id\": \"select-your-toppings-cajun-turkey\",\n" + 
				"      \"extraOptionsArray\": [],\n" + 
				"      \"isSorted\": false,\n" + 
				"      \"isAddOn\": false\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"optionSetName\": \"Select Your Toppings\",\n" + 
				"      \"optionsArray\": [\n" + 
				"        {\n" + 
				"          \"id\": \"447b43cd-aa4a-404e-9040-2ef07727b14e\",\n" + 
				"          \"name\": \"Old Bay Seasoning\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": true,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 40,\n" + 
				"            \"calculatedCalValue\": 40\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Sunflower+Seeds-BYsOCZ26.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"a5d50cb9-233a-4c30-bda4-a129faaa91ac\",\n" + 
				"          \"name\": \"Oregano\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 1,\n" + 
				"            \"calculatedCalValue\": 1\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/oregano-8RfzIxmp.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"dce64b8c-466f-4008-a565-ed0496e28104\",\n" + 
				"          \"name\": \"Black Pepper\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 0,\n" + 
				"            \"calculatedCalValue\": 0\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/pepper-rqeRU1Ue.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"66bcbebb-fe4c-4afe-89fe-077203b8d0cd\",\n" + 
				"          \"name\": \"Salt\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 0,\n" + 
				"            \"calculatedCalValue\": 0\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Salt-2RIaI0ug.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"4fe88d13-e257-4e14-8b9e-414be151d8d0\",\n" + 
				"          \"name\": \"Parmesan Cheese\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 0,\n" + 
				"            \"calculatedCalValue\": 0\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/grated+parmesan-niojI-o9.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"minAllowed\": 0,\n" + 
				"      \"maxAllowed\": 5,\n" + 
				"      \"hasCalorieMultiplier\": false,\n" + 
				"      \"id\": \"select-your-seasoning-cajun-turkey\",\n" + 
				"      \"extraOptionsArray\": [],\n" + 
				"      \"isSorted\": false,\n" + 
				"      \"isAddOn\": false\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"optionSetName\": \"Would You Like To Add\",\n" + 
				"      \"optionsArray\": [\n" + 
				"        {\n" + 
				"          \"id\": \"0869d3f5-aa1e-48bc-a909-e12711cc16c5\",\n" + 
				"          \"name\": \"Bacon\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0.5,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0.5\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 80,\n" + 
				"            \"calculatedCalValue\": 80\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Applewood+Smoked+Bac-kPzMS0Ip.png\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"194faec0-6c9f-4009-9fa4-7b5105687d85\",\n" + 
				"          \"name\": \"Avocado\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0.5,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0.5\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 70,\n" + 
				"            \"calculatedCalValue\": 70\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Ciabatta+Croutons-BH2cw6eT.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"52778752-2a58-4e92-a7e7-6ef44b517a95\",\n" + 
				"          \"name\": \"Pepperoni\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0.45,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0.45\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 80,\n" + 
				"            \"calculatedCalValue\": 80\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Pepperoni--3ioRw8w.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"          \"id\": \"036c8e19-5887-4a3c-81f4-42b47d5dd679\",\n" + 
				"          \"name\": \"Fresh Salsa\",\n" + 
				"          \"unitprice\": \"\",\n" + 
				"          \"isMandatory\": false,\n" + 
				"          \"isSelected\": false,\n" + 
				"          \"OptionsItemPricing\": {\n" + 
				"            \"amount\": 0.25,\n" + 
				"            \"currencyCode\": \"USD\",\n" + 
				"            \"display\": \"$0.25\"\n" + 
				"          },\n" + 
				"          \"calorieObj\": {\n" + 
				"            \"multiplier\": 0,\n" + 
				"            \"initialCalValue\": 80,\n" + 
				"            \"calculatedCalValue\": 80\n" + 
				"          },\n" + 
				"          \"imageUrl\": \"https://1deeb794cdb3fb9a0ba2-9a34df160cfd26704f1cf57826025ae2.ssl.cf1.rackcdn.com/Fresh+Salsa-_-RlUX5B.PNG\",\n" + 
				"          \"optionAddToCartUrl\": \"\",\n" + 
				"          \"choiceItemsArray\": [],\n" + 
				"          \"portionSize\": \"1\"\n" + 
				"        }\n" + 
				"      ],\n" + 
				"      \"minAllowed\": 0,\n" + 
				"      \"maxAllowed\": 4,\n" + 
				"      \"hasCalorieMultiplier\": false,\n" + 
				"      \"id\": \"would-you-like-to-add-for-hoagie\",\n" + 
				"      \"extraOptionsArray\": [],\n" + 
				"      \"isSorted\": false,\n" + 
				"      \"isAddOn\": true\n" + 
				"    }\n" + 
				"  ],\n" + 
				"  \"totalCalorie\": 0,\n" + 
				"  \"addToCartURL\": \"\",\n" + 
				"  \"productIdInAPI\": \"794d04e8-2817-4446-8691-b4311739acea\",\n" + 
				"  \"nutritionVal\": \"\",\n" + 
				"  \"isCustomizeProduct\": false,\n" + 
				"  \"defaultCalorie\": 0\n" + 
				"}";
		try {
		 sandWishData = mapper.readValue(jsonInString, SandWishData.class);
		} catch (IOException e) {
			 String msg = "Error while getting Data in ProfileService.sandWishData";
	         LOGGER.error(msg, e);
		}
		return sandWishData;
	}
}
