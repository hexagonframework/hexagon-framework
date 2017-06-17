<template>
  <div class="animated fadeIn">
    <div class="row">
      <div class="col-md-12">
        <div class="card">
          <div class="card-header">
            <i class="fa fa-align-justify"></i> vuetable-2
          </div>
          <div class="card-block">
			  <vuetable ref="vuetable"
			    api-url="https://vuetable.ratiw.net/api/users"
			    :fields="fields"
			    :css="css.table"
			    pagination-path=""
			    :multi-sort="true"
			    :sort-order="sortOrder"
                @vuetable:pagination-data="onPaginationData">
			  </vuetable>
			  <div class="vuetable-pagination">
			    <vuetable-pagination ref="pagination"
			      :css="css.pagination"
			      @vuetable-pagination:change-page="onChangePage"></vuetable-pagination>
          <vuetable-pagination-info ref="paginationInfo"
            :css="css.paginationInfo"
            :infoTemplate="info.dataInfo"
            :noDataTemplate="info.noDataInfo"
          ></vuetable-pagination-info>
			  </div>
		   </div>
		</div>
	  </div>
    </div>
  </div>
</template>

<script>
import accounting from 'accounting'
import moment from 'moment'
import {Vuetable, VuetablePagination, VuetablePaginationInfo} from 'vuetable-2'
import CssConfig from './components/VuetableCssConfig.js'

export default {
  components: {
    Vuetable,
    VuetablePagination,
    VuetablePaginationInfo
  },
  data () {
    return {
      css: CssConfig,
      info: {
        'dataInfo': '共{total}条',
        'noDataInfo': '无数据'
      },
      fields: [
        {
          name: 'name',
          sortField: 'name'
        },
        {
          name: 'email',
          sortField: 'email'
        },
        {
          name: 'birthdate',
          sortField: 'birthdate',
          titleClass: 'center aligned',
          dataClass: 'center aligned',
          callback: 'formatDate|YYYY-MM-DD'
        },
        {
          name: 'nickname',
          sortField: 'nickname',
          callback: 'allcap'
        },
        {
          name: 'gender',
          sortField: 'gender',
          titleClass: 'center aligned',
          dataClass: 'center aligned',
          callback: 'genderLabel'
        },
        {
          name: 'salary',
          sortField: 'salary',
          titleClass: 'center aligned',
          dataClass: 'right aligned',
          callback: 'formatNumber'
        }
      ],
      sortOrder: [
        {
          field: 'email',
          sortField: 'email',
          direction: 'asc'
        }
      ]
    }
  },
  methods: {
    allcap (value) {
      return value.toUpperCase()
    },
    genderLabel (value) {
      return value === 'M'
        ? '<i class="fa fa-male fa-lg"></i>男'
        : '<i class="fa fa-female fa-lg"></i>女'
    },
    formatNumber (value) {
      return accounting.formatNumber(value, 2)
    },
    formatDate (value, fmt = 'D MMM YYYY') {
      return (value == null)
        ? ''
        : moment(value, 'YYYY-MM-DD').format(fmt)
    },
    onPaginationData (paginationData) {
      this.$refs.pagination.setPaginationData(paginationData)
      this.$refs.paginationInfo.setPaginationData(paginationData)
    },
    onChangePage (page) {
      this.$refs.vuetable.changePage(page)
    }
  }
}
</script>
