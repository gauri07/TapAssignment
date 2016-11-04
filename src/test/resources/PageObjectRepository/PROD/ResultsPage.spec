Page Title: Search

#Object Definitions
====================================================================================
area_searchResult           css      #b_content
txt_resultCount             xpath    //span[@class='sb_count' and contains(text(),'results')]
result_text            		css    	 .search-result-text
first_product				xpath	 (//img[contains(@class,'product-image')])[1]
search_by_brand				css		 .sd-input.js-searchable-box
tablet_tab					xpath	 //ul[@id="js-12-nav"]//div[contains(.,'Tablets')]
dropdown					css		 .sort-drop.clearfix
brand_li   					css   	.filters-list.sdCheckbox>label[for="Brand-Samsung"]
sort_dropdown				css  	 div[class="sort-drop clearfix"]
txt_sort_selected_value 	css   	div[class="sort-selected"] 
select_fresh_arrival 		css  	 li[data-sorttype="rec"]
brand_verify				css		 .clear-filter-pill
verify_product_list			id		 products
====================================================================================