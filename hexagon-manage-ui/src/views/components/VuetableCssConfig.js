export default {
  table: {
    tableClass: 'table table-striped table-bordered',
    loadingClass: 'loading',
    ascendingIcon: 'fa fa-sort-up',
    descendingIcon: 'fa fa-sort-down',
    handleIcon: 'fa fa-reorder',
    renderIcon: function (classes, options) {
      return `<span class="${classes.join(' ')}"></span>`
    }
  },
  paginationInfo: {
    infoClass: 'pull-right floated aligned six wide column'
  },
  pagination: {
    wrapperClass: 'pagination pull-right',
    activeClass: 'btn-primary',
    disabledClass: 'disabled',
    pageClass: 'btn btn-border',
    linkClass: 'btn btn-border',
    icons: {
      first: '',
      prev: '',
      next: '',
      last: ''
    }
  }
}
